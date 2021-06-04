"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class CustomNode {
    constructor(element, next = null) {
        this.element = element;
        this.next = next;
    }
}
exports.default = CustomNode;
