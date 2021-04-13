/** @module rose */
import Flower from './flower.js';
/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Rose extends Flower {
    constructor(len, color, freshness) {
        super(len, color, freshness, Rose.K);
    }
}
Rose.K = 5.8;
