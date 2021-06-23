package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Text {
    private Sentence[] sentences;

    private static final String INTERROGATIVE_SENTENCES = "?";
    private HashSet<String> wantedWords;

    public Text(String textString) {
        String[] splitSentenceStrings = textString.split("(?<=[?.!])");
        sentences = new Sentence[splitSentenceStrings.length];
        for (int i = 0; i < splitSentenceStrings.length; i++) {
            sentences[i] = new Sentence(splitSentenceStrings[i].trim());
        }

    }

    @Override
    public String toString() {
        String[] textSentences = new String[sentences.length];
        int indexOftextSentences = 0;
        for (Sentence sentence : sentences) {
            textSentences[indexOftextSentences++] = sentence.toString();
        }
        return Arrays.deepToString(textSentences);
    }

    public void doLabTask(int n) {
        ArrayList<String> wantedWords = new ArrayList<String>();
        for (Sentence sentence : sentences) {
            // todo упростити
            if (sentence.toString().contains("?")) {
                if (sentence.doLabTaskNextCreateName(n).length == 0) {
                    continue;
                } else {
                    for (String s : sentence.doLabTaskNextCreateName(n)) {
                        wantedWords.add(s);
                    }
                }
                HashSet<String> hset = new HashSet<String>(wantedWords);
                this.wantedWords = hset;
            }
        }
    }


    public HashSet<String> getWantedWords() {
        return wantedWords;
    }

//    public void setWantedWords(HashSet<String> wantedWords) {
//        this.wantedWords = wantedWords;
//    }

}
