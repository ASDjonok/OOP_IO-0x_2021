import {Bouquet} from '../modules/index';
import {Peony} from '../modules/index';
import {Rose} from '../modules/index';
import {Snowdrop} from '../modules/index';
import {Accessory} from '../modules/index';

let arr = [new Peony(101, 'red', '88%'), new Rose(432, 'white', '44%'), new Snowdrop(4, 'blue', '1%'), new Accessory('Circle', 10)];
let bq = new Bouquet(arr);

describe('Bouquet module', () => {
  test('Total price value', () => {
    const totalPrice = arr.reduce((acc, { price }) => acc + parseFloat(price), 0); // 2489
    expect(bq.getTotalPrice()).toEqual(totalPrice);
  });

  test('Sort per freshness', () => {
    expect(bq.sortFresh()).toEqual([new Peony(101, 'red', '88%'), new Rose(432, 'white', '44%'), new Snowdrop(4, 'blue', '1%')]);
  });

  test('Filter by length', () => {
    expect(bq.filtertLen(100, 110)).toEqual([arr[0]]);
    expect(bq.filtertLen(1000, 10000).length).toBeFalsy();
    expect(bq.filtertLen(0, 10000).length).toBe(3);
  });
});