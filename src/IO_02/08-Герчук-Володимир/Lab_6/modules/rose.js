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
    super(len, Flower.getPrice(len, Rose.#K), color, freshness);
  }
}
