/** @module rose */

import Flower from './flower.js';

/**
 * Class representing a rose.
 * @extends Flower
 */
export default class Rose extends Flower {
  static #K = 5;

  /**
   * Create a rose.
   * @param {Number} len length.
   * @param {String} color color.
   * @param {Number} freshness level of freshness.
   */
  constructor(len, color, freshness) {
    super(len, Rose.getPrice(len), color, freshness);
  }

  /**
   * Calculate a price for the rose taking into account the length and coefficient.
   * @param {Number} len
   */
  static getPrice(len) {
    if (len < 1) {
      throw new Error('Invalid length for Rose');
    }
    return `${Rose.#K * len}`;
  }
}
