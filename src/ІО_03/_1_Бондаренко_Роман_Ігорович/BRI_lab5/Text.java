package BRI_lab5;

public class Text {
    private Sentence[] sentences;
    private static final String PUNCTUATIONS_BETWEEN_SENTENCES = ".…!?";

//    Create constructor to split text into sentences
    public Text(String textString) {
        String[] splitTextIntoSentences = textString.split("(?<=[" + PUNCTUATIONS_BETWEEN_SENTENCES + "] )");
        sentences = new Sentence[splitTextIntoSentences.length];
        for (int i = 0; i < splitTextIntoSentences.length; i++) {
            sentences[i] = new Sentence(splitTextIntoSentences[i]);
        }
    }
//    End of constructor

//    public int countYourSymbolInEverySentence(String symbol) {
//        int wordsCounter = 0;
//        for (Sentence sentence : sentences) {
//            wordsCounter += sentence.countYourSymbolInEveryWord(symbol);
//        }
//        return wordsCounter;
//    }

    @Override
    public String toString() {
        StringBuilder finalText = new StringBuilder();
        for (Sentence sentence : sentences) {
            finalText.append(sentence);
        }
        finalText.deleteCharAt(0);
        return finalText.toString();
    }
}
