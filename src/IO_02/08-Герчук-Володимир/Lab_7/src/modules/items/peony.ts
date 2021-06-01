/** @module peony */
import Flower from './flower';

/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Peony extends Flower {
  static readonly K = 3.4;
  
  constructor({ len, color, freshness }: FlowerConstructorConf) {
    super({ len, color, freshness, K: Peony.K });
  }
}
