/** @module Flower */

/** Class representing a single flower. */
export default class Flower {
  len: number;

  price: number;

  color: string;

  freshness: string;

  constructor({
    len, color, K, freshness,
  }: FlowerConstructorWithKoef) {
    if (len < 0 || parseFloat(freshness) < 0) {
      throw new Error('Invalid arguments in Flower');
    }

    this.len = len;
    this.price = K * len;
    this.color = color;
    this.freshness = freshness;
  }
}
