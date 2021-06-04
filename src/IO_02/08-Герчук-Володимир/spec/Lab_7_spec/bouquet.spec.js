// TODO: root path
const Bouquet = require('../../Lab_7/public/modules/bouquet').default;
const itemFactory = require('../../Lab_7/public/modules/itemFactory').default;
const Flower = require('../../Lab_7/public/modules/items/flower').default;
const Accessorie = require('../../Lab_7/public/modules/items/accessories').default;
const { 
  growPeony, 
  growRose, 
  growSnowdrop, 
  createAccessory 
} = itemFactory;

describe('Lab-7: Bouquet module', () => {
  beforeEach(() => {
    const defaultBqt = new Bouquet();
    defaultBqt.push(createAccessory({ name: '🎆', price: 100 }));
    defaultBqt.push(growRose({ color: 'red', len: 5, freshness: 100 }));
    defaultBqt.push(growRose({ color: 'white', len: 1, freshness: 5 }));
    defaultBqt.push(growSnowdrop({ color: '🌈', len: 10, freshness: 20 }));
    defaultBqt.push(growSnowdrop({ color: '⚪', len: 25, freshness: 35 }));
    defaultBqt.push(growPeony({ color: '🔴', len: 50, freshness: 25 }));
    defaultBqt.push(growPeony({ color: '🔵', len: 20, freshness: 50 }));

    this.defaultBqt = defaultBqt;

    spyOn(console, 'log');
    // console.log.calls.reset();
  });

  it('element property should have value instance of Flower or Accessory', () => {
    const nodeWithFlower = this.defaultBqt.elementAt(4);
    const nodeWithAccessory = this.defaultBqt.elementAt(0);
    expect(nodeWithFlower.element instanceof Flower).toBeTrue();
    expect(nodeWithAccessory.element instanceof Accessorie).toBeTrue();
  });

  describe('getArrOfFlowers method', () => {
    it('should return array with only flowers inside', () => {
      const arrOfFlower = this.defaultBqt.getArrOfFlowers();
      expect(arrOfFlower[0]).toEqual(jasmine.objectContaining({ color: 'red', len: 5, freshness: 100 }));
      expect(arrOfFlower[1]).toEqual(jasmine.objectContaining({ color: 'white', len: 1, freshness: 5 }));
      expect(arrOfFlower[2]).toEqual(jasmine.objectContaining({ color: '🌈', len: 10, freshness: 20 }));
      expect(arrOfFlower[3]).toEqual(jasmine.objectContaining({ color: '⚪', len: 25, freshness: 35 }));
      expect(arrOfFlower[4]).toEqual(jasmine.objectContaining({ color: '🔴', len: 50, freshness: 25 }));
      expect(arrOfFlower[5]).toEqual(jasmine.objectContaining({ color: '🔵', len: 20, freshness: 50 }));
    });
  });

  describe('sortPerFreshness', () => {
    it('should sort linked array by freshness', () => {
      this.defaultBqt.sortPerFreshness();
      const sortedArr = this.defaultBqt.getArrOfFlowers();
      expect(sortedArr[0]).toEqual(jasmine.objectContaining({ freshness: 5 }))
      expect(sortedArr[1]).toEqual(jasmine.objectContaining({ freshness: 20 }))
      expect(sortedArr[2]).toEqual(jasmine.objectContaining({ freshness: 25 }))
      expect(sortedArr[3]).toEqual(jasmine.objectContaining({ freshness: 35 }))
      expect(sortedArr[4]).toEqual(jasmine.objectContaining({ freshness: 50 }))
      expect(sortedArr[5]).toEqual(jasmine.objectContaining({ freshness: 100 }))
      expect(sortedArr[6]).toBeUndefined();
    });
  });

  describe('output method', () => {
    it('console.log should be called length-1 times', () => {
      this.defaultBqt.output();
      expect(console.log).toHaveBeenCalledTimes(this.defaultBqt.length);
      expect(console.log).toHaveBeenCalledWith(jasmine.objectContaining({ color: '⚪', len: 25, freshness: 35 }));
    });

    it('console.log should be called with undefined when list is empty', () => {
      (new Bouquet()).output();
      expect(console.log).toHaveBeenCalledTimes(1);
      expect(console.log).toHaveBeenCalledWith(undefined);
    });
  });

  describe('getTotalPrice method', () => {
    it('should return right total price of the bouquet', () => {
      expect(this.defaultBqt.getTotalPrice()).toBe(530.3);
    });
    
    it('should return 0 when bouquet is empty', () => {
      expect((new Bouquet()).getTotalPrice()).toBe(0);
    });
  });

  describe('getFlowersWithLength method', () => {
    it('shoud return array with all flowers from the \
      bouquet with the length included in the specified interval', () => {
        const res = this.defaultBqt.getFlowersWithLength(1, 20);
        expect(res.length).toBe(4);
        expect(res).toContain(jasmine.objectContaining({ color: '🌈', len: 10, freshness: 20 }));
        expect(res).toContain(jasmine.objectContaining({ len: 5 }));
        expect(res).toContain(jasmine.objectContaining({ len: 1 }));
        expect(res).toContain(jasmine.objectContaining({ len: 20 }));
    });

    it('shoud return empty array when Bouquet is empty or contains only accessories', () => {
      const bqt = new Bouquet();
      bqt.push(createAccessory({ name: '🎀', price: 14 }));
      const res = bqt.getFlowersWithLength(1, 100);
      expect(res.length).toBe(0); 
    });
  });
});