/** @module peony */
import Flower from './flower.js';

/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Peony extends Flower {
  static #K = 3;

  /**
   * Create a peony.
   * @param {Number} len length.
   * @param {String} color color.
   * @param {Number} freshness level of freshness.
   */
  constructor(len, color, freshness) {
    super(len, Flower.getPrice(len, Peony.#K), color, freshness);
  }
}
