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

const style = 'color: green; font-weight: 700; font-size: 20px;';
console.log('%cReady bouquet:', style, Bouquet.bouquet);
console.log('%cTotal price:', style, Bouquet.getTotalPrice());
console.log('%cSorted per freshness:', style, Bouquet.sortFresh());
console.log('%cLength interval includes:', style, Bouquet.sortLen(1, 10));
