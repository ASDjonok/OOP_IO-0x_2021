/* eslint-disable no-unused-vars */
/* eslint-disable no-console */
// Визначити ієрархію квітів. Створити кілька об'єктів-квітів.
// Зібрати букет (використовуючи аксесуари) з визначенням його вартості.
// Провести сортування квітів у букеті за рівнем свіжості.
// Знайти квітку в букеті, що відповідає заданому діапазону довжин.

const itemFactory = require('./modules/itemFactory');
const Bouquet = require('./modules/bouquet');
// (new Bouquet()).filterLen(-10, 2); -> console.error;

/* USAGE */
// const vars = ['growPeony', 'growRose', 'growSnowdrop'];
// const color = ['red', 'blue', 'white'];
// const bqt = new Bouquet();

// for (let i = 1, j = 0; i < 25; i++, j = i % 3) {
//   bqt.append(itemFactory[vars[j]]({ len: i, color: color[j], freshness: i * 5 }));
// }
// bqt.append(itemFactory.createAccessory({ name: 'stripe', price: 100 }));
// console.log(bqt.bouquet);
// console.log(bqt.getTotalPrice());
// console.log(bqt.sortFresh());
// console.log(bqt.filterLen(10, 100));
