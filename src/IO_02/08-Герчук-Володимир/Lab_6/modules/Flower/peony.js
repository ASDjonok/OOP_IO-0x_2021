/** @module peony */
const Flower = require('./flower.js');

/**
 * Class representing a peony.
 * @extends Flower
 */
module.exports = class Peony extends Flower {
  static #K = 3;

  /**
   * Create a peony.
   * @param {Number} len length.
   * @param {String} color color.
   * @param {Number} freshness level of freshness.
   */
  constructor({ len, color, freshness }) {
    super({
      len, price: Peony.#K * len, color, freshness,
    });
  }
};
