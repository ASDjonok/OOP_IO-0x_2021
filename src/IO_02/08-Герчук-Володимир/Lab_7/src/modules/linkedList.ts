import CustomNode from './customNode.js';

export default class LinkedArray implements Array<any> {
  length: number;
  head!: CustomNode;

  constructor() {
    this.length = 0;
  }
  
  [n: number]: any;
  filter(): any[] {
    throw new Error("Method not implemented.");
  }
  splice(): any[] {
    throw new Error("Method not implemented.");
  }
  concat(): any[] {
    throw new Error("Method not implemented.");
  }
  reduce(): any {
    throw new Error("Method not implemented.");
  }
  reduceRight(): any {
    throw new Error("Method not implemented.");
  }
  find(): any {
    throw new Error("Method not implemented.");
  }
  toString(): string {
    throw new Error("Method not implemented.");
  }
  toLocaleString(): string {
    throw new Error("Method not implemented.");
  }
  pop(): any {
    throw new Error("Method not implemented.");
  }
  push(element: any): number {
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
  reverse(): any[] {
    throw new Error("Method not implemented.");
  }
  shift(): any {
    throw new Error("Method not implemented.");
  }
  slice(): any[] {
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
  [Symbol.iterator](): IterableIterator<any> {
    throw new Error("Method not implemented.");
  }
  entries(): IterableIterator<[number, any]> {
    throw new Error("Method not implemented.");
  }
  keys(): IterableIterator<number> {
    throw new Error("Method not implemented.");
  }
  values(): IterableIterator<any> {
    throw new Error("Method not implemented.");
  }
  // for 'with' expression
  [Symbol.unscopables](): { copyWithin: boolean; entries: boolean; fill: boolean; find: boolean; findIndex: boolean; keys: boolean; values: boolean; } {
    throw new Error("Method not implemented.");
  }

  remove(element: any) {
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

  indexOf(element: any) {
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

  elementAt(index: number): any {
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

  addAt(index: number, element: any) {
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
}

