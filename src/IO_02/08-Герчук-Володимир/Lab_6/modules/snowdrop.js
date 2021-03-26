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
    super(len, Flower.getPrice(len, Snowdrop.#K), color, freshness);
  }
}
