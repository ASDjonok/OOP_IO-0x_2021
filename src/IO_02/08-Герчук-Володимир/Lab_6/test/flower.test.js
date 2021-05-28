import Flower from '../modules/flower';

describe('Lab_6 Flower module', () => {
  test('Right value from constructor', () => {
    const fl = new Flower(10, 20, 'red', '23%');
    const flTest = {
      len: 10,
      price: 20,
      color: 'red',
      freshness: '23%'
    };
    expect(fl).toEqual(flTest);
  });

  test('Constructor throws error with price || freshness || len <= 0', () => {
    expect(() => new Flower(-1, 20, 'Color', '10%')).toThrow(/invalid/i);
    expect(() => new Flower(111, 20, 'Color', '-1%')).toThrow(/invalid/i);
    expect(() => new Flower(111, 20, 'Color', '0%')).toThrow(/invalid/i);
    expect(() => new Flower(111, 0, 'Color', '12%')).toThrow(/invalid/i);
  });

  test('Right value from static getPrice method', () => {
    expect(Flower.getPrice(10, 5)).toEqual(50);
    expect(Flower.getPrice(2, 44)).toEqual(88);
  });

  test('getPrice method throws error on K <= 0', () => {
    expect(() => Flower.getPrice(44, -2)).toThrow();
    expect(() => Flower.getPrice(44, 0)).toThrow();
  });
});  