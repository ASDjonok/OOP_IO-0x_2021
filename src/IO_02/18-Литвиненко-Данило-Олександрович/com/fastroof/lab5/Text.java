package com.fastroof.lab5;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        String textString = "";
        for (Sentence sentence : sentences) {
            textString += sentence.toString();
        }
        return textString;
    }
}
