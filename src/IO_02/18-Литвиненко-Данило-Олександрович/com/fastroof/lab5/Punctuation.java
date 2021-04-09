package com.fastroof.lab5;

public class Punctuation {
    private char punctuationChar;
    private int afterWhatWord;

    public Punctuation(char punctuationChar, int afterWhatWord) {
        this.punctuationChar = punctuationChar;
        this.afterWhatWord = afterWhatWord;
    }

    public int getAfterWhatWord() {
        return afterWhatWord;
    }

    public char toChar() {
        return punctuationChar;
    }
}
