// C2 = 0 O1 = "+"
// C3 = 1 C = 1
// C5 = 3 O2 = "+"
// C7 = 5 тип індексів i та j = float
// #private - 66.77%
// Optional chaining operator (?.) - 85.66%
// Some mitigations which make it easier to access

// Implementations' developer tools may provide access to private fields (V8 issue).
// The decorators proposal gives tools for easy-to-use and controlled access to private fields.

class Labochka {
  static C = 1;

  /**
     * @param {Number} n
     * @param {Number} a float
     * @param {Number} m
     * @param {Number} b float
     */
  constructor(a, n, b, m) {
    this.a = a;
    this.n = n;
    this.b = b;
    this.m = m;
  }

  calc() {
    this._result = 0;

    if (this.a + Labochka.C <= 0 && this.n >= -(Labochka.C)) {
      console.error('Division by zero');
      return;
    }

    for (let i = this.a; i <= this.n; i++) {
      for (let j = this.b; j <= this.m; j++) {
        this._result += (i + j) / (i + Labochka.C);
      }
    }
  }

  get result() {
    return this._result?.toFixed(4) || 'No result!';
  }
}

const lb = new Labochka(1, 10, 123, 10);

console.log(lb.result);
lb.calc();
console.log(lb.result);
