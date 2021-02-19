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
    super(len, Peony.getPrice(len), color, freshness);
  }

  /**
   * Calculate a price for the peony taking into account the length and coefficient.
   * @param {Number} len
   */
  static getPrice(len) {
    if (parseFloat(len) < 1) {
      throw new Error('Invalid length for Peony');
    }
    return `${Peony.#K * parseFloat(len)}`;
  }
}
