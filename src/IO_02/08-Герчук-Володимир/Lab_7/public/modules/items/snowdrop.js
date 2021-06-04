"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
/** @module snowdrop */
const flower_1 = __importDefault(require("./flower"));
/**
 * Class representing a peony.
 * @extends Flower
 */
class Snowdrop extends flower_1.default {
    constructor({ len, color, freshness }) {
        super({
            len, color, freshness, K: Snowdrop.K,
        });
    }
}
exports.default = Snowdrop;
Snowdrop.K = 4.5;
