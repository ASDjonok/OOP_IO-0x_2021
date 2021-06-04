import LinkedArray from './linkedArray.js';
import Flower from './items/flower.js';
import Accessorie from './items/accessories.js';

type FA = Flower | Accessorie;

export default class Bouquet extends LinkedArray implements Array<FA> {
  getArrOfFlowers(): FA[] {
    const result = [];
    let current = this.head;
    while (current) {
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
        const nextNode = current.next;
        if (!nextNode) break;

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
    console.log(el?.element);

    if (el?.next) {
      this.output(el.next);
    }
  }

  getTotalPrice(): number {
    let total = 0;
    let node = this.head;

    while (node) {
      total += node.element.price;
      node = node.next;
    }

    return total;
  }

  getFlowersWithLength(min: number, max: number): FA[] {
    let node = this.head;
    const result = [];
    while (node) {
      if (node.element instanceof Accessorie) {
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
