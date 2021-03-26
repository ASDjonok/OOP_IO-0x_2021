// C3 = 1 | C = StringBuffer - provides string mutability
// C17 = 4
// В кожному реченні заданого тексту змінити
// місцями перше та останнє слово, не змінивши довжини речення.
// String object unchangable in JAVA

function isString(variable) {
  return typeof (variable) === 'string';
}

class Text {
  constructor(str) {
    if (isString(str)) {
      this.str = str;
      // eslint-disable-next-line no-useless-escape
      this.arr = this.str.replace(/[0-9]|[...]|[.,\/#!$%?\^&\*;:{}=\-_`~()@]/g, ' ').trim().split(' ');
    } else {
      throw new Error(`${str} - not a string.\nExpected 'string' data type`);
    }
  }

  move() {
    if (this.arr.length < 2) {
      console.error('Less than two words');
      return;
    }
    const lastEl = this.arr[this.arr.length - 1];
    const firstEl = this.arr[0];
    // replace - replaces only first occurence
    // todo fix lasEl replace
    this.replaced = this.str.replace(lastEl, firstEl).replace(firstEl, lastEl);
  }
}

const newStr = new Text('/././.123__Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud Lorem ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate laborum esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est %*^%&^*laborum.123');
newStr.move();
console.log(newStr.replaced);
