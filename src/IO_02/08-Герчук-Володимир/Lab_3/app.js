// C3 = 1 | C = StringBuffer - provides string mutability
// C17 = 4
// В кожному реченні заданого тексту змінити
// місцями перше та останнє слово, не змінивши довжини речення.
// String object unchangable in JAVA

export function isString(variable) {
  return typeof variable === 'string';
}

export class Text {
  constructor(str) {
    if (isString(str)) {
      this.str = str;
      this.arr = Text.createArr(str);
    } else {
      throw new Error(`${str} - not a string.\nExpected 'string' data type`);
    }
  }

  static createArr(str) {
    return str.replace(/[0-9]|[...]|[.,\/#!$%?\^&\*;:{}=\-_`~()@]/g, ' ').trim().split(' ');
  }

  move() {
    if (this.arr.length < 2) {
      throw Error('Less than two words');
      return;
    }
    const lastEl = this.arr[this.arr.length - 1];
    const firstEl = this.arr[0];
    // TODO: fix lasEl replace
    this.replaced = this.str.replace(lastEl, firstEl).replace(firstEl, lastEl);
    this.arr = Text.createArr(this.replaced);
    return this.replaced;
  }
}

const newStr = new Text('/././.123__Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud Lorem ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate laborum esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.');
newStr.move();
// console.log(newStr.replaced);
