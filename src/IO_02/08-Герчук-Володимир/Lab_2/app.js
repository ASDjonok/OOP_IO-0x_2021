//  0208
//  C5 = 3 - C=A ⊕ B (пряма сума)
//  C7 = 5 - char
//  C11 = 10 - Знайти середнє значення елементів матриці

class Labochka {
  constructor(fRows, fColumns, sRows, sColumns) {
    if (fRows >= 0 && fColumns >= 0 && sRows >= 0 && sColumns >= 0) {
      this.frstNumOfRows = fRows;
      this.secNumOfRows = sRows;
      this.rowLenFrst = fColumns;
      this.rowLenSec = sColumns;
      this.firstMatrix = Labochka.generateMatrix(fRows, fColumns);
      this.secMatrix = Labochka.generateMatrix(sRows, sColumns);
    } else {
      throw new Error('Uncorrect values');
    }
  }

  sum() {
    if (this.secNumOfRows > 0) {
      this.firstMatrix.forEach((row) => {
        for (let i = 0; i < this.rowLenSec; i++) {
          row.push(0);
        }
      });
    }
    if (this.frstNumOfRows > 0) {
      this.secMatrix.forEach((row) => {
        for (let i = 0; i < this.rowLenFrst; i++) {
          row.push(0);
        }
        row.reverse();
      });
    }
    this.matrixC = this.firstMatrix.concat(this.secMatrix);
    this.firstResult = this.matrixC.map((row) => row.map((el) => String.fromCharCode(el)));
  }

  average() {
    const sum = this.matrixC.reduce((acc, row) => acc.concat(row))
      .reduce((acc, number) => acc + number);

    const size = (this.frstNumOfRows + this.secNumOfRows) * (this.rowLenFrst + this.rowLenSec);
    return (sum / size).toFixed(2);
  }

  static generateMatrix(rows, columns) {
    const result = [];
    for (let row = 0; row < rows; row++) {
      const oneRow = [];
      for (let column = 0; column < columns; column++) {
        oneRow.push(Labochka.getRandomInt(97, 123));
      }
      result.push(oneRow);
    }
    return result;
  }

  static getRandomInt(min, max) {
    const minNum = Math.ceil(min);
    const maxNum = Math.floor(max);
    return Math.floor(Math.random() * (maxNum - minNum)) + minNum; // includes minNum
  }
}

const lb2 = new Labochka(1, 1, 2, 3);
lb2.sum();
console.log(lb2.matrixC);
console.log(lb2.firstResult);
console.log(lb2.average());
