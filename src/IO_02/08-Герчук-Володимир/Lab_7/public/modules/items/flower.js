/** @module Flower */
/** Class representing a single flower. */
export default class Flower {
    constructor({ len, color, K, freshness }) {
        if (len < 0 || parseFloat(freshness) < 0) {
            throw new Error('Invalid arguments in Flower');
        }
        this.len = len;
        this.price = K * len;
        this.color = color;
        this.freshness = freshness;
    }
}
