package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Sentence {
    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (Word word : words) {
            sentenceString
                    .append(word.toString())
                    .append(" ");
        }
        /*String sentenceString = "";
        for (Word word : words) {
            sentenceString += word.toString() + " ";
        }*/
        return sentenceString.toString();
    }
}
