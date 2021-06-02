/* eslint-disable no-console */
// Визначити ієрархію квітів. Створити кілька об'єктів-квітів.
// Зібрати букет (використовуючи аксесуари) з визначенням його вартості.
// Провести сортування квітів у букеті за рівнем свіжості.
// Знайти квітку в букеті, що відповідає заданому діапазону довжин.

const flowerFactory = require('./modules/itemFactory');
const Bouquet = require('./modules/bouquet');

const vars = ['growPeony', 'growRose', 'growSnowdrop'];
const color = ['red', 'blue', 'white'];
const bqt = new Bouquet();

for (let i = 1, j = 0; i < 25; i++, j = i % 3) {
  bqt.append(flowerFactory[vars[j]]({ len: i, color: color[j], freshness: i * 5 }));
}

console.log(bqt.bouquet);
console.log(bqt.getTotalPrice());
console.log(bqt.sortFresh());
console.log(bqt.filtertLen(10, 100));
