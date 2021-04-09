/** @module peony */
import Flower from './flower.js';

/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Peony extends Flower {
  static readonly K = 3.4;

  /**
   * Create a peony.
   * @param {Number} len length.
   * @param {String} color color.
   * @param {Number} freshness level of freshness.
   */
  constructor(len: number, color: string, freshness: string) {
    super(len,  color, freshness, Peony.K);
  }
}