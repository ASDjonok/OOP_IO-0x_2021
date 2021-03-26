/**
 * Accessories module.
 * @module Accessories
 */

import Bouquet from './bouquet.js';

/** Class representing Accessorie. */
export default class Accessorie {
  /**
     * Create accessorie.
     * @param {String} name name of accessorie.
     * @param {Number} price price of accessorie.
     */
  constructor(name, price) {
    this.name = name;
    this.price = price;
    Bouquet.bouquet.push(this);
  }
}
