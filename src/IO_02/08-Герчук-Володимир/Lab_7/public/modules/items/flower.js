"use strict";
/** @module Flower */
Object.defineProperty(exports, "__esModule", { value: true });
const Errors_1 = require("../Errors");
/** Class representing a single flower. */
class Flower {
    constructor({ len, color, K, freshness, }) {
        Errors_1.readPossibleError(() => {
            if (len < 0 || parseFloat(freshness) < 0) {
                throw new Errors_1.ArgumentError('Invalid arguments were given');
            }
            this.len = len;
            this.price = K * len;
            this.color = color;
            this.freshness = freshness;
        });
    }
}
exports.default = Flower;
