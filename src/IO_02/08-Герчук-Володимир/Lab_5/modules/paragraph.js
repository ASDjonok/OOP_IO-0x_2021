/** 
 * A paragraph module.
 * @module paragraph
*/
// replaceAll - 85%

import Sentence from './sentence.js';

/** Classs representing a paragraph. */
export default class Paragraph {
  /**
   * Crate single paragraph.
   * @param {String} paragraph 
   */
  constructor(paragraph) {
    this.paragraph = [];
    this.#roll(paragraph);
  }

  #roll(paragraph) {
    try {
      paragraph.match(/[^\.!\?]+[\.!\?]+/g).forEach((el) => {
        this.paragraph.push(new Sentence(el))
      });
    } catch(e) {
      console.error(`There must be at least one punctuation mark in the paragraph\nError in "${paragraph}" paragraph;`)
    }
  }
}
