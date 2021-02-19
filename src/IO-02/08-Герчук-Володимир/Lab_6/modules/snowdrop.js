/** @module snowdrop */

import Flower from './flower.js';

/**
 * Class representing a snowdrop.
 * @extends Flower
 */
export default class Snowdrop extends Flower {
  static #K = 4;

  /**
   * Create a snowdrop.
   * @param {Number} len length.
   * @param {String} color color.
   * @param {Number} freshness level of freshness.
   */
  constructor(len, color, freshness) {
    super(len, Snowdrop.getPrice(len), color, freshness);
  }

  /**
   * Calculate a price for the snowdrop taking into account the length and coefficient.
   * @param {Number} len
   */
  static getPrice(len) {
    if (len < 1) {
      throw new Error('Invalid length for Snowdrop');
    }
    return `${Snowdrop.#K * len}`;
  }
}
