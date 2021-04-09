package com.fastroof.lab5;

public class Word {
    private Letter[] letters;

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    @Override
    public String toString() {
        String wordString = "";
        for (int i = 0; i < letters.length; i++) {
            wordString += letters[i].toChar();
        }
        return wordString;
    }
}
