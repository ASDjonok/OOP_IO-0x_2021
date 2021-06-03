/**
 * Bouquet module.
 * @module bouquet
 */

const Flower = require('./Flower/flower');
const Accessory = require('./accessory');
const { readPossibleError, ArgumentError } = require('./Errors');
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
  /**
   * constructor for Bouquet class.
   * @param {Array} flowersArr
   */
  constructor(flowersArr = []) {
    this.bouquet = flowersArr;
  }

  /**
   * Returns a total price of the bouquet.
   * @returns {Number} total price
   */
  getTotalPrice() {
    if (this.bouquet.length > 0) {
      return this.bouquet.reduce((acc, {
        price,
      }) => acc + parseFloat(price), 0);
    }

    return 0;
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
  filterLen(start, stop) {
    return readPossibleError(() => {
      if (start < 0 || stop < 0 || start >= stop || !isNum(start) || !isNum(stop)) {
        throw new ArgumentError('Invalid arguments given');
      }

      return this.bouquet.filter(({ len }) => len >= start && len <= stop);
    });
  }

  /**
   * @param {Object} flower flower that should be added
   * @returns {Void}
   */
  append(item) {
    readPossibleError(() => {
      if (!(item instanceof Flower || item instanceof Accessory)) {
        throw new ArgumentError('Wrong data type... 🌚');
      }
      this.bouquet.push(item);
    });
  }
};
