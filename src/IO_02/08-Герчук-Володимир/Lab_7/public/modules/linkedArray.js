"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const customNode_1 = __importDefault(require("./customNode"));
const Errors_1 = require("./Errors");
class LinkedArray {
    constructor() {
        this.length = 0;
        this.head = null;
    }
    filter() {
        throw new Error('Method not implemented.');
    }
    splice() {
        throw new Error('Method not implemented.');
    }
    concat() {
        throw new Error('Method not implemented.');
    }
    reduce() {
        throw new Error('Method not implemented.');
    }
    reduceRight() {
        throw new Error('Method not implemented.');
    }
    find() {
        throw new Error('Method not implemented.');
    }
    toString() {
        throw new Error('Method not implemented.');
    }
    toLocaleString() {
        throw new Error('Method not implemented.');
    }
    pop() {
        throw new Error('Method not implemented.');
    }
    join() {
        throw new Error('Method not implemented.');
    }
    reverse() {
        throw new Error('Method not implemented.');
    }
    shift() {
        throw new Error('Method not implemented.');
    }
    slice() {
        throw new Error('Method not implemented.');
    }
    sort() {
        throw new Error('Method not implemented.');
    }
    unshift() {
        throw new Error('Method not implemented.');
    }
    lastIndexOf() {
        throw new Error('Method not implemented.');
    }
    every() {
        throw new Error('Method not implemented.');
    }
    some() {
        throw new Error('Method not implemented.');
    }
    forEach() {
        throw new Error('Method not implemented.');
    }
    map() {
        throw new Error('Method not implemented.');
    }
    findIndex() {
        throw new Error('Method not implemented.');
    }
    fill() {
        throw new Error('Method not implemented.');
    }
    copyWithin() {
        throw new Error('Method not implemented.');
    }
    // specifies the default iterator for an object
    [Symbol.iterator]() {
        throw new Error('Method not implemented.');
    }
    entries() {
        throw new Error('Method not implemented.');
    }
    keys() {
        throw new Error('Method not implemented.');
    }
    values() {
        throw new Error('Method not implemented.');
    }
    // for 'with' expression
    [Symbol.unscopables]() {
        throw new Error('Method not implemented.');
    }
    push(element) {
        const node = new customNode_1.default(element);
        if (!this.head) {
            this.head = node;
        }
        else {
            let currentNode = this.head;
            while (currentNode.next) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        return this.length++;
    }
    remove(element) {
        if (!this.head)
            return null;
        let currentNode = this.head;
        let previousNode;
        if (currentNode.element === element) {
            this.head = currentNode.next;
        }
        else {
            while (currentNode.element !== element) {
                previousNode = currentNode;
                if (!currentNode.next)
                    return null;
                currentNode = currentNode.next;
            }
            previousNode.next = currentNode.next;
        }
        this.length--;
        return element;
    }
    indexOf(element) {
        if (!this.head)
            return -1;
        let currentNode = this.head;
        let index = -1;
        while (currentNode) {
            index++;
            if (currentNode.element === element) {
                return index;
            }
            if (!currentNode.next) {
                break;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }
    elementAt(index) {
        Errors_1.readPossibleError(() => {
            if (index >= this.length || index < 0) {
                throw new Errors_1.ArgumentError(`Invalid index (${index})`, index);
            }
        });
        let currentNode = this.head;
        let count = 0;
        while (count < index) {
            count++;
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    addAt(index, element) {
        Errors_1.readPossibleError(() => {
            if (index > this.length || index < 0) {
                throw new Errors_1.ArgumentError(`Invalid index (${index})`);
            }
        });
        const node = new customNode_1.default(element);
        let currentNode = this.head;
        let previousNode;
        let currentIndex = 0;
        if (index === 0) {
            node.next = currentNode;
            this.head = node;
        }
        else {
            while (currentIndex < index) {
                currentIndex++;
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            node.next = currentNode;
            previousNode.next = node;
        }
        this.length++;
    }
    removeAt(index) {
        Errors_1.readPossibleError(() => {
            if (index < 0 || index >= this.length) {
                throw new Errors_1.ArgumentError(`Invalid index (${index})`);
            }
        });
        let currentNode = this.head;
        let previousNode;
        let currentIndex = 0;
        if (index === 0) {
            this.head = currentNode && currentNode.next;
        }
        else {
            while (currentIndex < index) {
                currentIndex++;
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = currentNode.next;
        }
        this.length--;
        return currentNode;
    }
}
exports.default = LinkedArray;
