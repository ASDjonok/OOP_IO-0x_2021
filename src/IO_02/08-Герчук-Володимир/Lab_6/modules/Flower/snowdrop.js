/** @module snowdrop */

const Flower = require('./flower.js');

/**
 * Class representing a snowdrop.
 * @extends Flower
 */
module.exports = class Snowdrop extends Flower {
  static #K = 4;

  /**
   * Create a snowdrop.
   * @param {Number} len length.
   * @param {String} color color.
   * @param {Number} freshness level of freshness.
   */
  constructor({ len, color, freshness }) {
    super({ len, color, freshness, price: Snowdrop.#K * len });
  }
}
