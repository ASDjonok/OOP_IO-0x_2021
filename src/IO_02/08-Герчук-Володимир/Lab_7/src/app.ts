// C2 -> list
// C3 -> Однозв’язний список
import { Snowdrop, Rose, Peony, Accessorie, Bouquet } from './modules/index.js';

const peony = new Peony(2, 'red', '25%');
const rose = new Rose(33, 'light-blue', '56%');
const snowdrop = new Snowdrop(43, 'green', '35%');
const snowdrop2 = new Snowdrop(12, 'white', '53%');
const stripe = new Accessorie('stripe', 35);
const someAcc = new Accessorie('stripe-red', 55);
const bouquet = new Bouquet();

// bouquet.add(peony);
// bouquet.add(rose);
// bouquet.add(snowdrop);
// bouquet.add(snowdrop2);
// bouquet.add(stripe);
// bouquet.add(someAcc);
bouquet.add(peony, rose, snowdrop, snowdrop2, stripe, someAcc);

bouquet.sortPerFreshness()
bouquet.getOutput();

console.log(bouquet.getTotalPrice());
console.log(bouquet.getFlowerWithLength(-10, 20))
console.log(bouquet.indexOf(rose));
console.log(bouquet.elementAt(3))
console.log(bouquet.remove(someAcc));
console.log(bouquet.indexOf(someAcc))
console.log(bouquet.length);