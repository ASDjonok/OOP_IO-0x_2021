import flowerFactory from '../modules/flowerFactory.js';
import { Peony, Rose, Snowdrop } from '../modules/index.js'; 

describe('Lab-6: flowerFactory module', () => {
  test('should return peony', () => {
    // K = 3
    const peony = flowerFactory.growPeony({ len: 10, color: 'blue', freshness: 100 });
    expect(peony).toBeInstanceOf(Peony);
    expect(peony).toEqual({ len: 10, color: 'blue', freshness: 100, price: 30 });
  });
  test('should return rose', () => {
    // K = 5
    const rose = flowerFactory.growRose({ len: 10, color: 'red', freshness: 100 });
    expect(rose).toBeInstanceOf(Rose);
    expect(rose).toEqual({ len: 10, color: 'red', freshness: 100, price: 50 })
  });
  test('should return snowdrop', () => {
    // K = 4 
    const snowdrop = flowerFactory.growSnowdrop({ len: 5, color: 'white', freshness: 100 });
    expect(snowdrop).toBeInstanceOf(Snowdrop);
    expect(snowdrop).toEqual({ len: 5, color: 'white', freshness: 100, price: 20 })
  });
});