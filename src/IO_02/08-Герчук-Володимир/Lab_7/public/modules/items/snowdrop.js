/** @module snowdrop */
import Flower from './flower';
/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Snowdrop extends Flower {
    constructor({ len, color, freshness }) {
        super({ len, color, freshness, K: Snowdrop.K });
    }
}
Snowdrop.K = 4.5;
