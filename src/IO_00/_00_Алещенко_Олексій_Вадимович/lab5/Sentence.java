package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Sentence {
//    private Word[] words;
//    private Punctuation[] punctuations;
    private /*Object*/SentenceMember[] sentenceMembers /*= {new Word("Hello"), new Punctuation(".")}*/;

//    @Deprecated
//    public Sentence(Word[] words) {
//        this.words = words;
//    }

    public Sentence(String sentenceString) {
//        String[] wordStrings = sentenceString.split(" ,.");
//        String[] wordStrings = sentenceString.split("((?<=[,.] ?)|(?=[,.] ?))");
//        todo check " ?" is needed
//        String[] wordStrings = sentenceString.split("(?=[,.] ?)| ");
//        String[] sentenceMemberStrings = sentenceString.split("(?=[,.])| ");
//        todo check how it works with different punctuation characters (e.g. "\"", " - ")
        String[] sentenceMemberStrings = sentenceString.split("(?=\\p{Punct})| ");

//        System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
//        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));
        /*System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));*/
        /*System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));*/

//        words = new Word[wordStrings.length];
//        new SentenceMember();
        sentenceMembers = new SentenceMember[sentenceMemberStrings.length];
        for (int i = 0; i < sentenceMemberStrings.length; i++) {
            String sentenceMemberString = sentenceMemberStrings[i];
            sentenceMembers[i] = sentenceMemberString.matches("\\p{Punct}")
                                    ? new Punctuation(sentenceMemberString)
                                    : new Word(sentenceMemberString);
        }
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        /*for (SentenceMember sentenceMember : sentenceMembers) {
            sentenceString
                    .append(sentenceMember.toString())
                    .append(" ");
        }*/
        for (int i = 0; i < sentenceMembers.length - 1; i++) {
            sentenceString.append(sentenceMembers[i].toString());
            if (/*i+1 < sentenceMembers.length &&*/ sentenceMembers[i+1] instanceof Word) {
                sentenceString.append(" ");
            }
        }
        sentenceString.append(sentenceMembers[sentenceMembers.length - 1].toString());
//        sentenceString.deleteCharAt(sentenceString.length() - 1);
        /*String sentenceString = "";
        for (Word word : words) {
            sentenceString += word.toString() + " ";
        }*/
        return sentenceString.toString();
    }
}
