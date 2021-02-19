/* eslint-disable no-new */

// Визначити ієрархію квітів. Створити кілька об'єктів-квітів.
// Зібрати букет (використовуючи аксесуари) з визначенням його вартості.
// Провести сортування квітів у букеті за рівнем свіжості.
// Знайти квітку в букеті, що відповідає заданому діапазону довжин.

import {
  Bouquet, Rose, Peony, Snowdrop, Accessorie
} from './modules/index.js';

new Rose(10, 'red', '10%');
new Peony(23, 'white', '99%');
new Snowdrop(5, 'white', '88%');
new Rose(20, 'white', '54%');
new Peony(20, 'color', '99%');
new Snowdrop(5, 'white', '10%');
new Accessorie('tape', 12);

console.log(Bouquet.bouquet);
console.log(Bouquet.getTotalPrice());
console.log(Bouquet.sortFresh());
console.log(Bouquet.sortLen(1, 10));
