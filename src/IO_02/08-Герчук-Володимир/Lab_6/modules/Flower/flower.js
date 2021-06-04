/** @module Flower */

const { readPossibleError, ArgumentError } = require('../Errors');

/** Class representing a single flower. */
module.exports = class Flower {
  /**
   * Create a flower.
   * @param {Number} len length of the flower.
   * @param {Number} price price of the flower.
   * @param {String} color color of the flower.
   * @param {Number} freshness level of freshness of the flower.
   */
  constructor({
    len, price, color, freshness,
  }) {
    readPossibleError(() => {
      if (parseFloat(len) <= 0 || parseFloat(freshness) < 0 || parseFloat(price) <= 0) {
        throw new ArgumentError('Invalid arguments given');
      }

      this.len = len;
      this.price = price;
      this.color = color;
      this.freshness = freshness;
    });
  }
};
