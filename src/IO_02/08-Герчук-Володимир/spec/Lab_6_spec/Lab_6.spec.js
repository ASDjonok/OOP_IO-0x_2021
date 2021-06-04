const Bouquet = require('../../Lab_6/modules/bouquet.js');
const itemFactory = require('../../Lab_6/modules/itemFactory.js');
const { 
  growPeony, 
  growRose, 
  growSnowdrop, 
  createAccessory 
} = itemFactory;
const Accessory = require('../../Lab_6/modules/accessory.js');
const { ArgumentError } = require('../../Lab_6/modules/Errors.js');


describe('Lab-6: Bouquet module', () => {
  beforeEach(() => {
    // length = 9
    this.defaultBqt = new Bouquet([
      growPeony({ len: 5, color: '⚪', freshness: 55 }),
      growSnowdrop({ len: 10, color: '🔵', freshness: 66 }),
      growRose({ len: 12, color: '🔴', freshness: 44 }),
      growPeony({ len: 23, color: '⚪', freshness: 22 }),
      growSnowdrop({ len: 55, color: '🔵', freshness: 33 }),
      growRose({ len: 44, color: '🔴', freshness: 11 }),
      createAccessory({ name: '🎀', price: 45 }),
      createAccessory({ name: '🎋', price: 45 }),
      createAccessory({ name: '🎉', price: 45 })
    ]);

    spyOn(console, 'error');
  });

  describe('append method', () => {
    it('should add Flowers or Accessory to the bouquet', () => {
      const vars = ['growPeony', 'growRose', 'growSnowdrop']
      const color = ['red', 'blue', 'white']
      const bqt = new Bouquet();
      for (let i = 1, j = 0; i < 25; i++, j = i % 3) {
        bqt.append(itemFactory[vars[j]]({ len: i, color: color[j], freshness: i * 5}));
      }
      bqt.append(createAccessory({ name: 'stripe', price: 100 }));
      
      expect(bqt.bouquet.length).toBe(25);
    });
    it('should log error when argument is not a Flower or Accessory', () => {
      expect(() => this.defaultBqt.append('not a 🌷')).toThrow();
      expect(console.error).toHaveBeenCalledTimes(1);
      expect(this.defaultBqt.bouquet).not.toContain('not a 🌷');
      expect(this.defaultBqt.bouquet.length).toBe(9);
    });
  });

  describe('getTotalPrice method', () => {
    it('getTotalPrice should return total price of the bouquet', () => {
      expect(this.defaultBqt.getTotalPrice()).toBe(759);
      expect((new Bouquet([growPeony({ len: 10, color: '', freshness: 4})])).getTotalPrice()).toBe(30);
      expect((new Bouquet()).getTotalPrice()).toBe(0);
    });
  });

  describe('sortFresh method', () => {
    it('sortFresh should sort only flowers per freshness', () => {
      const sortedBqt = this.defaultBqt.sortFresh();
  
      expect(sortedBqt.length).toBe(6);
      expect(sortedBqt[0]).toEqual(jasmine.objectContaining({
        freshness: 66
      }));
      expect(sortedBqt[1]).toEqual(jasmine.objectContaining({
        freshness: 55
      }));
      expect(sortedBqt[2]).toEqual(jasmine.objectContaining({
        freshness: 44
      }));
      expect(sortedBqt[3]).toEqual(jasmine.objectContaining({
        freshness: 33
      }));
      expect(sortedBqt[4]).toEqual(jasmine.objectContaining({
        freshness: 22
      }));
      expect(sortedBqt[5]).toEqual(jasmine.objectContaining({
        freshness: 11
      }));
      expect(sortedBqt[6]).toBeUndefined();
    });
  });

  describe('filterLen method', () => {
    it('should delete all flowers with unmathced length', () => {
      expect(this.defaultBqt.filterLen(5, 10).length).toBe(2);
      expect(this.defaultBqt.filterLen(10, 44).length).toBe(4);
      expect(this.defaultBqt.filterLen(10, 44)).not.toContain(jasmine.any(Accessory));
    });

    it('shlould log error when start or stop argument is invalid', () => {
      expect(() => this.defaultBqt.filterLen(-10, 10)).toThrow(new ArgumentError('Invalid arguments given'));
      expect(console.error).toHaveBeenCalledTimes(1);
      expect(console.error).toHaveBeenCalledWith(jasmine.stringMatching(/Invalid arguments given/))
    });
  });
});