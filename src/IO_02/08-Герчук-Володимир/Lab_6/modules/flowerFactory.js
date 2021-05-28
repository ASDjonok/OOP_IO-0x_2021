import Peony from './Flower/peony.js';
import Rose from './Flower/rose.js';
import Snowdrop from './Flower/snowdrop.js';

const flowerFactory = {
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
}

export default flowerFactory;
