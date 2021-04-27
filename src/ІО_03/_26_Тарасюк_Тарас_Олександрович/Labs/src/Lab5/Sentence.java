package Lab5;

public class Sentence {
    private SentenceMember[] sentenceMembers;
    private static final String PUNCTUATIONS_STRING = ",.?!";

    public Sentence(String sentenceString) {
        String[] splitSentenceElementsString = sentenceString.split("(?=[" + PUNCTUATIONS_STRING + "])|\\s");
        sentenceMembers = new SentenceMember[splitSentenceElementsString.length];
        for (int i = 0; i < splitSentenceElementsString.length; i++) {
            if (PUNCTUATIONS_STRING.contains(splitSentenceElementsString[i])) {
                sentenceMembers[i] = new Punctuation(splitSentenceElementsString[i]);
            } else{
                sentenceMembers[i] = new Word(splitSentenceElementsString[i]);
            }
        }
    }

    @Override
    public String toString() {
        //todo this comment
//        for (SentenceMember sentenceMember : sentenceMembers) {
//            if (sentenceMember instanceof Word){
//                if (sentenceMember.toString().length() == 3){
//                    System.out.println(sentenceMember);
//                }
//            }
//        }
        String sentence = "";
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word){
                sentence += " "+sentenceMember;
            } else if (sentenceMember instanceof  Punctuation){
                sentence += sentenceMember+" ";
            }
        }
        return sentence.trim();
    }

    public String[] doLabTaskNextCreateName(int n) {

        int sizeOfWantedWords = getSizeOfWantedWords(sentenceMembers, n);

        String [] wantedWords = new String[sizeOfWantedWords];
        int indexOfWantedWords = 0;
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word){
                if (sentenceMember.toString().length() == n) {
                    wantedWords[indexOfWantedWords++] = sentenceMember.toString();
                }
            }
        }

        return wantedWords;
//        System.out.println(Arrays.deepToString(wantedWords));

    }

    private static int getSizeOfWantedWords(SentenceMember[] sentenceMembers, int n){
        int sizeOfWantedWords = 0;
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word){
                if (sentenceMember.toString().length() == n){
                    sizeOfWantedWords++;
                }
            }
        }
        return sizeOfWantedWords;
    }
}
