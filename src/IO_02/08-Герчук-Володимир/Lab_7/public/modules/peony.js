/** @module peony */
import Flower from './flower.js';
/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Peony extends Flower {
    /**
     * Create a peony.
     * @param {Number} len length.
     * @param {String} color color.
     * @param {Number} freshness level of freshness.
     */
    constructor(len, color, freshness) {
        super(len, color, freshness, Peony.K);
    }
}
Peony.K = 3.4;
