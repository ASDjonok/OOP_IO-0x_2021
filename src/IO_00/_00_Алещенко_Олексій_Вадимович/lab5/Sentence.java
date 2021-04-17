package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Sentence {
    //    todo add punctuation
    private Word[] words;
    private Punctuation[] punctuations;
    private /*Object*/SentenceMember[] sentenceMembers /*= {new Word("Hello"), new Punctuation(".")}*/;

    public Sentence(Word[] words) {
        this.words = words;
    }

    public Sentence(String sentenceString) {
//        String[] wordStrings = sentenceString.split(" ,.");
//        String[] wordStrings = sentenceString.split("((?<=[,.] ?)|(?=[,.] ?))");
        String[] wordStrings = sentenceString.split("(?=[,.] ?)| ");

        /*System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));*/
        /*System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));*/

        words = new Word[wordStrings.length];
        for (int i = 0; i < wordStrings.length; i++) {
            words[i] = new Word(wordStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (Word word : words) {
            sentenceString
                    .append(word.toString())
                    .append(" ");
        }
        sentenceString.deleteCharAt(sentenceString.length() - 1);
        /*String sentenceString = "";
        for (Word word : words) {
            sentenceString += word.toString() + " ";
        }*/
        return sentenceString.toString();
    }
}
