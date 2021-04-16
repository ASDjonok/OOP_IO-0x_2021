/** @module rose */
import Flower from './flower.js';

/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Rose extends Flower {
  static readonly K = 5.8;
  
  constructor(len: number, color: string, freshness: string) {
    super(len,  color, freshness, Rose.K);
  }
}