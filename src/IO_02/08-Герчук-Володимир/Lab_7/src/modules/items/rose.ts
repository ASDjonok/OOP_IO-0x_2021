/** @module rose */
import Flower from './flower';

/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Rose extends Flower {
  static readonly K = 5.8;
  
  constructor({ len, color, freshness }: FlowerConstructorConf) {
    super({ len, color, freshness, K: Rose.K });
  }
}