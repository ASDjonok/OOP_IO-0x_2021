"use strict";
/** @module Flower */
Object.defineProperty(exports, "__esModule", { value: true });
/** Class representing a single flower. */
class Flower {
    constructor({ len, color, K, freshness, }) {
        if (len < 0 || parseFloat(freshness) < 0) {
            throw new Error('Invalid arguments in Flower');
        }
        this.len = len;
        this.price = K * len;
        this.color = color;
        this.freshness = freshness;
    }
}
exports.default = Flower;
