package com.fastroof.lab5;

public class Sentence {
    private Word[] words;
    private Punctuation[] punctuations;

    public Sentence(Word[] words, Punctuation[] punctuations) {
        this.words = words;
        this.punctuations = punctuations;
    }

    public Word[] getWords() {
        return words;
    }

    @Override
    public String toString() {
        String sentenceString = "";
        for (int i = 0; i < words.length; i++) {
            sentenceString += words[i].toString();
            for (int j = 0; j < punctuations.length; j++) {
                if (i == punctuations[j].getAfterWhatWord()) {
                    sentenceString += punctuations[j].toChar();
                }
            }
            sentenceString += " ";
        }
        return sentenceString;
    }
}
