/**
 * Bouquet module.
 * @module bouquet
 */

const Flower = require('./Flower/flower.js');
const Accessory = require('./accessory');
/**
 * Checks if argument is integer.
 * @param {any} num
 * @returns {Boolean}
 */
function isNum(num) {
  return Number.isInteger(num);
}

/**
 * Class representing a hole bouquet.
 */
module.exports = class Bouquet {
  constructor(flowersArr = []) {
    this.bouquet = flowersArr;
  }

  /**
   * Returns a total price of the bouquet.
   * @returns {Number} total price
   */
  getTotalPrice() {
    return this.bouquet.reduce((acc, {
      price,
    }) => acc + parseFloat(price), 0);
  }

  /**
   * Returns sorted bouquet per freshness, without accessories.
   * @returns {Array} sorted array.
   */
  sortFresh() {
    return this.bouquet.filter((el) => !!el.freshness)
      .sort((next, prev) => parseFloat(prev.freshness) - parseFloat(next.freshness));
  }

  /**
   * Filters the bouquet of flowers by the specified length interval.
   * @param {Number} start beggining of the range. - INCLUDED
   * @param {Numebr} stop end of the range. - INCLUDED
   * @returns {Array} filtered array.
   */
  filtertLen(start, stop) {
    if (start < 0 || stop < 0 || start >= stop || !isNum(start) || !isNum(stop)) {
      throw new Error('Invalid arguments');
    }
    return this.bouquet.filter(({ len }) => len >= start && len <= stop);
  }

  /**
   * @param {Object} flower flower that should be added
   * @returns {Void}
   */
  append(flower) {
    if (!(flower instanceof Flower || flower instanceof Accessory)) throw Error('Wrong data type... 🌚');
    this.bouquet.push(flower);
  }
};
