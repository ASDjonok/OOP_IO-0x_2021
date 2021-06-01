/** @module peony */
import Flower from './flower';
/**
 * Class representing a peony.
 * @extends Flower
 */
export default class Peony extends Flower {
    constructor({ len, color, freshness }) {
        super({ len, color, freshness, K: Peony.K });
    }
}
Peony.K = 3.4;
