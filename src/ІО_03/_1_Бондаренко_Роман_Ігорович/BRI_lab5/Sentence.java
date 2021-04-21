package BRI_lab5;

public class Sentence {
    private SentenceMember[] sentenceMembers;
    public static final String PUNCTUATIONS_IN_SENTENCES = ".…,:!?";
    public static final String SPECIAL_PUNCTUATION = "-";
    public static final String PUNCTUATIONS = PUNCTUATIONS_IN_SENTENCES + SPECIAL_PUNCTUATION;
    public static final String REGEX = "(?=[" + PUNCTUATIONS + "])|\\s";

//    Create constructor to split a sentence into elements (words and punctuations)
    public Sentence(String sentenceString) {
        String[] splitSentenceIntoElements = sentenceString.split(REGEX);
        // Elements is a words or punctuations
        sentenceMembers = new SentenceMember[splitSentenceIntoElements.length];
        for (int i = 0; i < splitSentenceIntoElements.length; i++) {
            if (PUNCTUATIONS_IN_SENTENCES.contains(splitSentenceIntoElements[i])) {
                sentenceMembers[i] = new Punctuation(splitSentenceIntoElements[i]);
            } else {
                sentenceMembers[i] = new Word(splitSentenceIntoElements[i]);
            }
        }
    }
//    End of constructor

//    public int countYourSymbolInEveryWord(String symbol) {
//        int wordsCounter = 0;
//        for (SentenceMember sentenceMember : sentenceMembers) {
//            if (!PUNCTUATIONS.contains(sentenceMember.toString())) {
//                if (sentenceMember.toString().contains(symbol)) {
//                    wordsCounter++;
//                }
//            }
//        }
//        return wordsCounter;
//    }

    @Override
    public String toString() {
        StringBuilder finalSentence = new StringBuilder();
        for (SentenceMember sentenceMember : sentenceMembers) {
//          This is my own way of solving problem about spaces between words and punctuations. It starts here.
            if (PUNCTUATIONS_IN_SENTENCES.contains(sentenceMember.toString())) {
                finalSentence.append(sentenceMember.toString());
            } else {
                finalSentence.append(" ").append(sentenceMember);
            }
//          The end of solving that problem.
        }
        return finalSentence.toString();
    }
}
