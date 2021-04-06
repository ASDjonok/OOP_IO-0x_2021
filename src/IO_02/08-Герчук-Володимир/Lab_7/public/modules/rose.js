/** @module rose */
import Flower from './flower.js';
/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Rose extends Flower {
    /**
     * Create a rose.
     * @param {Number} len length.
     * @param {String} color color.
     * @param {Number} freshness level of freshness.
     */
    constructor(len, color, freshness) {
        super(len, color, freshness, Rose.K);
    }
}
Rose.K = 5.8;
