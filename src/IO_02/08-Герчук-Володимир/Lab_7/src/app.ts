// C2 -> list
// C3 -> Однозв’язний список
import { Snowdrop, Rose, Peony, Accessorie, Bouquet, Flower } from './modules/index.js';

// usage

const peony = new Peony(2, 'red', '25%');
const rose = new Rose(33, 'light-blue', '56%');
const snowdrop = new Snowdrop(43, 'green', '35%');
const snowdrop2 = new Snowdrop(12, 'white', '53%');
const stripe = new Accessorie('stripe', 35);
const someAcc = new Accessorie('stripe-red', 55);

const bouquet = new Bouquet();

// TODO: index signature

// let result = bouquet.head
// const proxiedBouquet = new Proxy(bouquet,{
//   get (target, prop, receiver) {
//     if (Number(prop) < receiver.length) {
//       for (let counter = 0; counter <= Number(prop); counter++) {
//         result = result.next;
//       }

//       return result;
//     }

//     return undefined;
//   }
// });
//

bouquet.push(peony);
bouquet.push(rose);
bouquet.push(snowdrop);
bouquet.push(snowdrop2);
bouquet.push(someAcc);
bouquet.push(stripe);

bouquet.sortPerFreshness()
bouquet.getOutput();

// console.log(bouquet.getTotalPrice());
// console.log(bouquet.getFlowerWithLength(-10, 20));
// console.log(bouquet.indexOf(snowdrop));
// console.log(bouquet.elementAt(3));
// console.log(bouquet.remove(someAcc));
// console.log(bouquet.indexOf(someAcc))
// console.log(bouquet.length);