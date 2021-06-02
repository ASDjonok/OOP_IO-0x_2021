/**
 * Accessories module.
 * @module Accessories
 */

/** Class representing Accessorie. */
module.exports = class Accessory {
  /**
   * Create accessorie.
   * @param {String} name name of accessorie.
   * @param {Number} price price of accessorie.
   */
  constructor({ name, price }) {
    if (price <= 0) {
      throw Error(`Invalid inout for price - ${price}`);
    }
    this.name = name;
    this.price = price;
  }
};
