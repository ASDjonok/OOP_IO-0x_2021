import LinkedArray from './linkedList.js';
import Flower from './flower.js';
import Accessorie from './accessories.js';
import CustomNode from './customNode.js';

type FA = Flower | Accessorie;

export default class Bouquet extends LinkedArray implements Array<FA> {
  head!: CustomNode;

  // IDK
  getArOfFlowers(): FA[] {
    const result = [];
    let current = this.head;
    while(current) {
      const toPush = current.element;
      if (toPush instanceof Flower) {
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
        let nextNode = current.next;
        if(!nextNode) break;
        
        if (parseInt(nextNode.element.freshness) < parseInt(current.element.freshness)) {
          const temp = current.element;
          current.element = nextNode.element;
          nextNode.element = temp;

          unsorted = true;
        }

        current = current.next
      }
    }

    return this;
  }

  // IDK
  output(el = this.head) {
    console.log(el.element);

    if (el.next) {
      this.output(el.next);
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