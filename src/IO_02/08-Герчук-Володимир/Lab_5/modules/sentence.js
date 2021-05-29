/**
 * Sentence module.
 * @module sentence
 */

import Word from './word.js';
import Punctuation from './punctuation.js';

/** Class representing one sentence. */
export default class Sentence {
  /**
   * An array of punctuation marks.
   * @static
   */
  static punctuation = '!"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~ '.split('') + ['...'];
  /**
   * Create a sentence.
   * @param {String} sentence
   */
  constructor(sentence) {
    this.sentence = [];
    this.#roll(sentence);
  }

  #roll(sentence) {
    sentence.match(/[\w']+|[.,!?;_ ]/g).forEach((el) => {
      if (Sentence.punctuation.includes(el)) {
        this.sentence.push(new Punctuation(el));

        return;
      }
      this.sentence.push(new Word(el));
    });
  }
}
