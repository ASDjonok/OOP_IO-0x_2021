/** @module rose */
import Flower from './flower';
/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Rose extends Flower {
    constructor({ len, color, freshness }) {
        super({ len, color, freshness, K: Rose.K });
    }
}
Rose.K = 5.8;
