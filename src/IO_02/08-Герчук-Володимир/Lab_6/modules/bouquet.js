/**
 * Bouquet module.
 * @module bouquet
 */
import Flower from './flower.js';

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
export default class Bouquet {
  static bouquet = [];

  /**
   * Returns a total price of the bouquet.
   * @returns {Number} total price
   */
  static getTotalPrice() {
    return Bouquet.bouquet.reduce((acc, {
      price
    }) => acc + parseFloat(price), 0);
  }

  /**
   * Returns sorted bouquet per freshness, without accessories.
   * @returns {Array} sorted array.
   */
  static sortFresh() {
    return Bouquet.bouquet.filter((el) => el instanceof Flower)
      .sort((next, prev) => parseFloat(prev.freshness) - parseFloat(next.freshness));
  }

  /**
   * Filters the bouquet of flowers by the specified length interval.
   * @param {Number} start beggining of the range.
   * @param {Numebr} stop end of the range.
   * @returns {Array} filtered array.
   */
  static sortLen(start, stop) {
    if (start < 0 || stop < 0 || start >= stop || !isNum(start) || !isNum(stop)) {
      console.error('Invalid arguments');
      return new Error('Invalid arguments');
    }
    return Bouquet.bouquet
      .filter(({
        len
      }) => len >= start && len <= stop);
  }
}
