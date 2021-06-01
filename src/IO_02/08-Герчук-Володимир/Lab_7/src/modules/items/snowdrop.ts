/** @module snowdrop */
import Flower from './flower';

/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Snowdrop extends Flower {
  static readonly K = 4.5;

  constructor({ len, color, freshness }: FlowerConstructorConf) {
    super({ len, color, freshness, K: Snowdrop.K });
  }
}