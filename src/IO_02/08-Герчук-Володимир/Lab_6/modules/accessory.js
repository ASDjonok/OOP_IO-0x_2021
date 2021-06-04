/**
 * Accessories module.
 * @module Accessories
 */

const { ArgumentError, readPossibleError } = require('./Errors');
/** Class representing Accessorie. */
module.exports = class Accessory {
  /**
   * Create accessorie.
   * @param {String} name name of accessorie.
   * @param {Number} price price of accessorie.
   */
  constructor({ name, price }) {
    readPossibleError(() => {
      if (price <= 0) {
        throw new ArgumentError('Invalid input for price', price);
      }

      this.name = name;
      this.price = price;
    });
  }
};
