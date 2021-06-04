"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
/** @module peony */
const flower_1 = __importDefault(require("./flower"));
/**
 * Class representing a peony.
 * @extends Flower
 */
class Peony extends flower_1.default {
    constructor({ len, color, freshness }) {
        super({
            len, color, freshness, K: Peony.K,
        });
    }
}
exports.default = Peony;
Peony.K = 3.4;
