/** @module snowdrop */
import Flower from './flower.js';

/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Snowdrop extends Flower {
  static readonly K = 4.5;

  constructor(len: number, color: string, freshness: string) {
    super(len,  color, freshness, Snowdrop.K);
  }
}