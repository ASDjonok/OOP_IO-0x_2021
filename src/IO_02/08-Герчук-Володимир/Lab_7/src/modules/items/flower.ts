/** @module Flower */

import { readPossibleError, ArgumentError } from '../Errors';

/** Class representing a single flower. */
export default class Flower {
  len: number;

  price: number;

  color: string;

  freshness: string;

  constructor({
    len, color, K, freshness,
  }: FlowerConstructorWithKoef) {
    readPossibleError(() => {
      if (len < 0 || parseFloat(freshness) < 0) {
        throw new ArgumentError('Invalid arguments were given');
      }
  
      this.len = len;
      this.price = K * len;
      this.color = color;
      this.freshness = freshness;
    });
  }
}
