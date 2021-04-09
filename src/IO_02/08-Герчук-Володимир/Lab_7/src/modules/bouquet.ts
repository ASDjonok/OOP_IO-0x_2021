import { Flower, Accessorie } from './index.js';
type FA = Flower | Accessorie;

class CustomNode {
  next!: CustomNode;
  constructor(public element: any) { }
}

export default class Bouquet {
  length: number;
  private head!: CustomNode;

  constructor() {
    this.length = 0;
  }

  add(...elements: FA[]) {
    for (let element of elements) {
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
    }
  }

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

  isEmpty() {
    return this.length === 0;
  }

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

    while(unsorted) {
      unsorted = false;
      let current = this.head;

      while(current) {
        let nextNode = current.next;

        if (!nextNode) {
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

  getTotalPrice() {
    let total = 0;
    let node = this.head;

    while (node) {
      total += node.element.price;
      node = node.next;
    }

    return total;
  }

  getFlowerWithLength(min: number, max:number): Flower[] {
    let node = this.head;
    const result = [];
    while (node) {
      const length = node.element.len;
      if (length <= max && length >= min) {
        result.push(node.element);
      }
      node = node.next;
    }

    return result;
  }
}