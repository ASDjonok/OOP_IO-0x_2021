/**
 * Word module.
 * @module word
 */
import Letter from './letter.js';

/** Class representing a single word in a sentence. */
export default class Word {
  /**
   * Create a word.
   * @param {String} word
   */
  constructor(word) {
    this.word = word.split('').map(el => {
      return new Letter(el);
    });
  }
}
