const flowerFactory = require('../modules/itemFactory.js');
const Peony = require('../modules/Flower/peony');
const Rose = require('../modules/Flower/rose');
const Snowdrop = require('../modules/Flower/snowdrop');

describe('Lab-6: flowerFactory module', () => {
  it('should return Peony', () => {
    const peony = flowerFactory.growPeony({ len: 10, color: 'blue', freshness: 100 });
    expect(peony).toBeInstanceOf(Peony);
  });
  it('should return Rose', () => {
    const rose = flowerFactory.growRose({ len: 10, color: 'red', freshness: 100 });
    expect(rose).toBeInstanceOf(Rose);
  });
  it('should return Snowdrop', () => {
    const snowdrop = flowerFactory.growSnowdrop({ len: 5, color: 'white', freshness: 100 });
    expect(snowdrop).toBeInstanceOf(Snowdrop);
  });
});