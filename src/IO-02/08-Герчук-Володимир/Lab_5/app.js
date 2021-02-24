// export * as - 73%
// ' ' -> punctuation

import Paragraph from './modules/paragraph.js';

/** Class representing a text. */
class Text {
  /**
   * Create main text.
   * @param {String} text
   */
  constructor(text) {
    this.text = text;
    this.resultedText = [];
    this.#roll();
  }

  #roll() {
    this.text.replace(/[\n\r]/g,'\n ').replace(/ +/g, ' ').split('\n').forEach((el) => {
      try {
        this.resultedText.push(new Paragraph(el));
      } catch(err) {
        console.log(err);
      }
    });
  }

  /**
   * Get text with replaced first and last words.
   * @returns {String}
  */
  getFinalOutput() {
    const output = [];
    let firstWord = '';
    let lastWord = '';

    this.resultedText.forEach((paragraphObj) => {
      paragraphObj.paragraph.forEach((sentenceObj) => {
        sentenceObj.sentence.forEach((wordObj) => {
          if (wordObj.punctuation) {
            output.push(wordObj.punctuation);
            return;
          }
          output.push(wordObj);
        });
      });
    });

    for (let i = 0; !firstWord.word; i++) {
      firstWord = output[i];
    }
    for (let i = 1; !lastWord.word; i++) {
      lastWord = output[output.length - i];
    }
    [output[output.indexOf(lastWord)], output[output.indexOf(firstWord)]] = [firstWord, lastWord];

    return output.map((el) => {
      if (el.word) {
        return el.word.reduce((acc, { letter }) => acc + letter, '');
      }
      return el;
    }).join('');
  }
}

const legend = new Text('FirstWord ipsum dolor sit, amet consectetur. Adipisicing elit. Nostrum aperiam placeat mollitia adipisci iusto eligendi, non nemo aspernatur sapiente possimus, quae, officiis cum dolores deleniti eius. Totam quo corporis iure?\nLorem ipsum dolor sit, amet consectetur adipisicing elit. Nostrum aperiam placeat mollitia adipisci iusto eligendi, non nemo aspernatur sapiente possimus, quae, officiis cum dolores deleniti eius. Totam quo corporis iure?\nLorem ipsum dolor sit, amet consectetur adipisicing elit. Nostrum aperiam placeat molliem ipsum dolor sit, amet consectetur adipisicing elit. Nostrum aperiam placeat mollitia adipisci iusto eligendi, non nemo aspernaturtia adipisci iusto eligendi, non nemo aspernatur sapiente possimus, quae, officiis cum dolores deleniti eius. Totam quo corporis iure?\nLor sapiente possimus, quae. LAST...');
console.log(`%cInput: %c${legend.text}`, 'color: green; font-weight: 700; font-size: 20px;', 'color: blue');
console.log(`%cOutput: %c${legend.getFinalOutput()}`, 'color: green; font-weight: 700; font-size: 20px;', 'color: blue');
console.log('%cTREE:', 'color: green; font-weight: 700; font-size: 20px;' ,legend.resultedText);
