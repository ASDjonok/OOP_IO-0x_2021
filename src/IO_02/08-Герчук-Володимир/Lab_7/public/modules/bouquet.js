"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const linkedArray_js_1 = __importDefault(require("./linkedArray.js"));
const flower_js_1 = __importDefault(require("./items/flower.js"));
const accessories_js_1 = __importDefault(require("./items/accessories.js"));
class Bouquet extends linkedArray_js_1.default {
    getArrOfFlowers() {
        const result = [];
        let current = this.head;
        while (current) {
            const toPush = current.element;
            if (toPush instanceof flower_js_1.default) {
                result.push(current.element);
            }
            current = current.next;
        }
        return result;
    }
    sortPerFreshness() {
        let unsorted = true;
        while (unsorted) {
            unsorted = false;
            let current = this.head;
            while (current) {
                const nextNode = current.next;
                if (!nextNode)
                    break;
                if (parseInt(nextNode.element.freshness) < parseInt(current.element.freshness)) {
                    const temp = current.element;
                    current.element = nextNode.element;
                    nextNode.element = temp;
                    unsorted = true;
                }
                current = current.next;
            }
        }
        return this;
    }
    output(el = this.head) {
        // eslint-disable-next-line no-console
        console.log(el === null || el === void 0 ? void 0 : el.element);
        if (el === null || el === void 0 ? void 0 : el.next) {
            this.output(el.next);
        }
    }
    getTotalPrice() {
        let total = 0;
        let node = this.head;
        while (node) {
            total += node.element.price;
            node = node.next;
        }
        return total;
    }
    getFlowersWithLength(min, max) {
        let node = this.head;
        const result = [];
        while (node) {
            if (node.element instanceof accessories_js_1.default) {
                node = node.next;
                continue;
            }
            const length = node.element.len;
            if (length <= max && length >= min) {
                result.push(node.element);
            }
            node = node.next;
        }
        return result;
    }
}
exports.default = Bouquet;
