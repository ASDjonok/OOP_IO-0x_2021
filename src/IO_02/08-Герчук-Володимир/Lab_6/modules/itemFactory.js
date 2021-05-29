const Peony = require('./Flower/peony.js');
const Rose = require('./Flower/rose.js');
const Snowdrop = require('./Flower/snowdrop.js');
const Accessory = require('../modules/accessory');
module.exports = {
  /**
   * @param {{ len: number, color: string, freshness: number }} stats   - The values for Peony.
   * @returns { Peony }
   */
  growPeony: (stats) => new Peony(stats),
  /**
   * @param {{ len: number, color: string, freshness: number }} stats   - The values for Rose.
   * @returns { Rose }
   */
  growRose: (stats) => new Rose(stats),
  /**
   * @param {{ len: number, color: string, freshness: number }} stats    - The values for Snowdrop.
   * @returns { Snowdrop }
   */
  growSnowdrop: (stats) => new Snowdrop(stats),
  /**
   * @param {{ name: string, price: number }} stats                      - The values for Accessory.
   * @returns { Accessory }
   */
  createAccessory: (stats) => new Accessory(stats),
}
