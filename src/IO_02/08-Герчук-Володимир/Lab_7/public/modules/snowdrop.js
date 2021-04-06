/** @module snowdrop */
import Flower from './flower.js';
/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Snowdrop extends Flower {
    /**
     * Create a Snowdrop.
     * @param {Number} len length.
     * @param {String} color color.
     * @param {Number} freshness level of freshness.
     */
    constructor(len, color, freshness) {
        super(len, color, freshness, Snowdrop.K);
    }
}
Snowdrop.K = 4.5;
