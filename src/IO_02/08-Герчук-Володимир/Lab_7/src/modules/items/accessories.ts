/**
 * Accessories module.
 * @module Accessories
 */

/** Class representing Accessorie. */
export default class Accessorie {
  name:  string;
  price: number;
  constructor({ name, price }: AccessorieConstructorConf){
    this.name = name;
    this.price = price;
  }
}