"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
// C2 -> list
// C3 -> Однозв’язний список
const bouquet_1 = __importDefault(require("./modules/bouquet"));
const itemFactory_1 = __importDefault(require("./modules/itemFactory"));
const flower_1 = __importDefault(require("./modules/items/flower"));
const bqt = new bouquet_1.default();
bqt.push(itemFactory_1.default.createAccessory({ name: '', price: 23 }));
bqt.output();
console.log(new flower_1.default({ len: -10, color: 'red', freshness: '123%', K: 4 }));
// const peony = new Peony(2, 'red', '25%');
// const rose = new Rose(33, 'light-blue', '56%');
// const snowdrop = new Snowdrop(43, 'green', '35%');
// const snowdrop2 = new Snowdrop(12, 'white', '53%');
// const stripe = new Accessorie('stripe', 35);
// const someAcc = new Accessorie('stripe-red', 55);
// const bqt = new Bouquet();
// bqt.push(peony);
// bqt.push(rose);
// bqt.push(snowdrop);
// bqt.push(snowdrop2);
// bqt.push(stripe);
// bqt.push(someAcc);
// bqt.sortPerFreshness();
// bqt.output();
// console.log(bqt.getTotalPrice());
// console.log(bqt.getFlowerWithLength(0, 20));
// console.log(bqt.getFlowerWithLength(20, 50));
// console.log(bqt.indexOf(snowdrop));
// console.log(bqt.elementAt(3));
// console.log(bqt.remove(someAcc));
// console.log(bqt.indexOf(someAcc))
// console.log(bqt.length);
