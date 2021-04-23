package BRI_lab5;

public class Sentence {
    private SentenceMember[] sentenceMembers;
    private static final String PUNCTUATIONS = "\\p{Punct}";

    public Sentence(String sentenceString) {
        String[] splitSentenceIntoElements = sentenceString.split("(?=" + PUNCTUATIONS + ")| ");
        sentenceMembers = new SentenceMember[splitSentenceIntoElements.length];
        for (int i = 0; i < splitSentenceIntoElements.length; i++) {
            sentenceMembers[i] = splitSentenceIntoElements[i].matches(PUNCTUATIONS)
                    ? new Punctuation(splitSentenceIntoElements[i])
                    : new Word(splitSentenceIntoElements[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder finalSentence = new StringBuilder();
        for (int i = 0; i < sentenceMembers.length - 1; i++) {
            finalSentence.append(sentenceMembers[i].toString());
            if (sentenceMembers[i+1] instanceof Word) {
                finalSentence.append(" ");
            }
        }
        finalSentence.append(sentenceMembers[sentenceMembers.length - 1].toString());
        return finalSentence.toString();
    }
}
