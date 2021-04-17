import { Flower, Accessorie } from './index.js';
type FA = Flower | Accessorie;

class CustomNode {
  next!: CustomNode;
  constructor(public element: FA) {}
}

export default class Bouquet implements Array<FA> {
  length: number;
  head!: CustomNode;

  constructor() {
    this.length = 0;
  }
  [n: number]: FA;
  filter(): FA[] {
    throw new Error("Method not implemented.");
  }
  splice(): FA[] {
    throw new Error("Method not implemented.");
  }
  concat(): FA[] {
    throw new Error("Method not implemented.");
  }
  reduce(): FA {
    throw new Error("Method not implemented.");
  }
  reduceRight(): FA {
    throw new Error("Method not implemented.");
  }
  find(): FA {
    throw new Error("Method not implemented.");
  }
  toString(): string {
    throw new Error("Method not implemented.");
  }
  toLocaleString(): string {
    throw new Error("Method not implemented.");
  }
  pop(): Flower | Accessorie {
    throw new Error("Method not implemented.");
  }
  push(element: FA): number {
    const node = new CustomNode(element);

    if (!this.head) {
      this.head = node;
    } else {
      let currentNode = this.head;
      while (currentNode.next) {
        currentNode = currentNode.next;
      }

      currentNode.next = node;
    }

    this.length++;
    return this.length - 1;
  }
  join(): string {
    throw new Error("Method not implemented.");
  }
  reverse(): FA[] {
    throw new Error("Method not implemented.");
  }
  shift(): Flower | Accessorie {
    throw new Error("Method not implemented.");
  }
  slice(): FA[] {
    throw new Error("Method not implemented.");
  }
  sort(): this {
    throw new Error("Method not implemented.");
  }
  unshift(): number {
    throw new Error("Method not implemented.");
  }
  lastIndexOf(): number {
    throw new Error("Method not implemented.");
  }
  every(): boolean {
    throw new Error("Method not implemented.");
  }
  some(): boolean {
    throw new Error("Method not implemented.");
  }
  forEach(): void {
    throw new Error("Method not implemented.");
  }
  map<U>(): U[] {
    throw new Error("Method not implemented.");
  }
  findIndex(): number {
    throw new Error("Method not implemented.");
  }
  fill(): this {
    throw new Error("Method not implemented.");
  }
  copyWithin(): this {
    throw new Error("Method not implemented.");
  }
  // specifies the default iterator for an object
  [Symbol.iterator](): IterableIterator<FA> {
    throw new Error("Method not implemented.");
  }
  entries(): IterableIterator<[number, FA]> {
    throw new Error("Method not implemented.");
  }
  keys(): IterableIterator<number> {
    throw new Error("Method not implemented.");
  }
  values(): IterableIterator<FA> {
    throw new Error("Method not implemented.");
  }
  // for 'with' expression
  [Symbol.unscopables](): { copyWithin: boolean; entries: boolean; fill: boolean; find: boolean; findIndex: boolean; keys: boolean; values: boolean; } {
    throw new Error("Method not implemented.");
  }

  // add(...elements: FA[]) {
  //   for (let element of elements) {
  //     const node = new CustomNode(element);

  //     if (!this.head) {
  //       this.head = node;
  //     } else {
  //       let currentNode = this.head;
  //       while (currentNode.next) {
  //         currentNode = currentNode.next;
  //       }

  //       currentNode.next = node;
  //     }

  //     this.length++;
  //   }
  // }
  // unoverride
  remove(element: FA) {
    if (!this.head) return;

    let currentNode = this.head;
    let previousNode: CustomNode;

    if (currentNode.element === element) {
      this.head = currentNode.next;
    } else {
      while (currentNode.element !== element) {
        previousNode = currentNode;
        if (!currentNode.next) return null;
        currentNode = currentNode.next;
      }

      previousNode!.next = currentNode.next;
    }

    this.length--;
  }
  // overide
  indexOf(element: FA) {
    if (!this.head) return -1;
    let currentNode = this.head;
    let index = -1;

    while (currentNode) {
      index++;
      if (currentNode.element === element) {
        return index;
      }
      currentNode = currentNode.next;
    }

    return -1;
  }

  // TODO: implement it with a proxy
  elementAt(index: number): FA {
    if (index >= this.length) {
      throw Error('Index is too big');
    }

    let currentNode = this.head;
    let count = 0;
    while (count < index) {
      count++;
      currentNode = currentNode.next
    }
    return currentNode.element;
  }

  addAt(index: number, element: FA) {
    if (index > this.length) {
      throw Error(`Index - ${index} is grater than length - ${this.length}`);
    }

    const node = new CustomNode(element);
    let currentNode = this.head;
    let previousNode: CustomNode;
    let currentIndex = 0;

    if (index === 0) {
      node.next = currentNode;
      this.head = node;
    } else {
      while (currentIndex < index) {
        currentIndex++;
        previousNode = currentNode;
        currentNode = currentNode.next;
      }
      node.next = currentNode;
      previousNode!.next = node;
    }

    this.length++;
  }

  removeAt(index: number) {
    let currentNode = this.head;
    let previousNode: CustomNode;
    let currentIndex = 0;
    if (index < 0 || index >= this.length) {
      return null;
    }
    if (index === 0) {
      this.head = currentNode.next;
    } else {
      while (currentIndex < index) {
        currentIndex++;
        previousNode = currentNode;
        currentNode = currentNode.next;
      }
      previousNode!.next = currentNode.next;
    }
    this.length--;
    return currentNode.element;
  }

  sortPerFreshness() {
    let unsorted = true;

    while (unsorted) {
      unsorted = false;
      let current = this.head;

      while (current) {
        let nextNode = current.next;

        if (!nextNode ||
            nextNode.element instanceof Accessorie ||
            current.element instanceof Accessorie
            ) {
          current = current.next;
          break;
        }

        if (parseInt(nextNode.element.freshness) < parseInt(current.element.freshness)) {
          const temp = current.element;
          current.element = nextNode.element;
          nextNode.element = temp;

          unsorted = true;
        }

        current = current.next
      }
    }
  }

  getOutput(el = this.head) {
    console.log(el.element);

    if (el.next) {
      this.getOutput(el.next);
    }
  }

  getTotalPrice(): number {
    let total = 0;
    let node = this.head;

    do {
      total += node.element.price;
      node = node.next;
    } while (node);

    return total;
  }

  getFlowerWithLength(min: number, max: number): FA[] {
    let node = this.head;
    const result = [];
    while (node) {
      if (node.element instanceof Accessorie) { 
        node = node.next;
        continue;
      }
      const length = node.element.len;
      if (length <= max && length >= min)  {
        result.push(node.element);
      }
      node = node.next;
    }

    return result;
  }
}