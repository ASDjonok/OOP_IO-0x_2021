/** @module Flower */
/** Class representing a single flower. */
export default class Flower {
    constructor(len, color, freshness, K) {
        if (len < 0 || parseFloat(freshness) < 0) {
            throw new Error('Invalid arguments in Flower');
        }
        this.len = len;
        this.price = Flower.getPrice(len, K);
        this.color = color;
        this.freshness = freshness;
    }
    /**
     * Calculate a price of the flower taking into account the length and coefficient.
     */
    static getPrice(len, K) {
        if (Number(len) < 1 || K < 0) {
            throw new Error('Invalid arguments for flower in getPrice.');
        }
        return K * len;
    }
}
