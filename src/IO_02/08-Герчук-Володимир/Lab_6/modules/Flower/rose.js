/** @module rose */

const Flower = require('./flower.js');

/**
 * Class representing a rose.
 * @extends Flower
 */
module.exports = class Rose extends Flower {
  static #K = 5;

  /**
   * Create a rose.
   * @param {Number} len length.
   * @param {String} color color.
   * @param {Number} freshness level of freshness.
   */
  constructor({ len, color, freshness }) {
    super({ len, price: Rose.#K * len, color, freshness });
  }
}
