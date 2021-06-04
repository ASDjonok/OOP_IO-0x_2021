/**
 * Bouquet module.
 * @module itemFactory
 */

const Peony = require('./Flower/peony');
const Rose = require('./Flower/rose');
const Snowdrop = require('./Flower/snowdrop');
const Accessory = require('./accessory');

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
};
