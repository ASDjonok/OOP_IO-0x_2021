package BRI_lab5;

public class Text {
    private Sentence[] sentences;
    private static final String PUNCTUATIONS_BETWEEN_SENTENCES = ".…!?";

    public Text(String textString) {
        String[] splitTextIntoSentences = textString.split("(?<=[" + PUNCTUATIONS_BETWEEN_SENTENCES + "] )");
        sentences = new Sentence[splitTextIntoSentences.length];
        for (int i = 0; i < splitTextIntoSentences.length; i++) {
            sentences[i] = new Sentence(splitTextIntoSentences[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder finalText = new StringBuilder();
        for (Sentence sentence : sentences) {
            finalText.append(sentence);
        }
        return finalText.toString();
    }
}
