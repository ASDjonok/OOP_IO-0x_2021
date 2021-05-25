package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;

    private static final char SENTENCE_DELIMITER = ' ';

    public Text(String textString) {
//        String[] sentenceStrings = textString.split("(?<=[?.!] |[?.!])");
//        String[] sentenceStrings = textString.split("(?<=[?.!]| )");
//        String[] sentenceStrings = textString.split("(?<=[?.!] ?)");
        String[] sentenceStrings = textString.split("(?<=[?.!])\\s?");
        /*System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));*/
        sentences = new Sentence[sentenceStrings.length];
        for (int i = 0; i < sentenceStrings.length; i++) {
            sentences[i] = new Sentence(sentenceStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder textStringBuilder = new StringBuilder();
        for (int i = 0; i < sentences.length - 1; i++) {
            textStringBuilder.append(sentences[i]/*.toString()*/).append(SENTENCE_DELIMITER);
        }
        textStringBuilder.append(sentences[sentences.length - 1]/*.toString()*/);
        return textStringBuilder.toString();
    }

    public String findLargestPalindromicSubstring() {
        final Boundaries largestPalindromicBoundaries =
                Sentence.findLargestPalindromicSubstring(sentences);
        return toStringWithBoundaries(largestPalindromicBoundaries);
    }

    public String toStringWithBoundaries(Boundaries boundaries) {
        StringBuilder textWithBoundariesSB = new StringBuilder();

        int indexSentenceWithStartBoundary = getIndexSentenceWithStartBoundary(boundaries);
        int indexSentenceWithEndBoundary =
                getIndexSentenceWithEndBoundary(boundaries, indexSentenceWithStartBoundary);

        final Sentence sentenceWithStartBoundary = sentences[indexSentenceWithStartBoundary];
        if (indexSentenceWithStartBoundary == indexSentenceWithEndBoundary) {
            textWithBoundariesSB.append(sentenceWithStartBoundary.toStringWithBoundaries(boundaries));
        } else {
            textWithBoundariesSB.append(sentenceWithStartBoundary.toStringWithStartBoundary(boundaries));

            for (int i = indexSentenceWithStartBoundary + 1; i < indexSentenceWithEndBoundary; i++) {
                textWithBoundariesSB.append(SENTENCE_DELIMITER).append(sentences[i]);
            }

            textWithBoundariesSB.append(SENTENCE_DELIMITER)
                    .append(sentences[indexSentenceWithEndBoundary].toStringWithEndBoundary(boundaries));
        }

        return textWithBoundariesSB.toString();
    }

    private int getIndexSentenceWithEndBoundary(Boundaries boundaries, int indexSentenceWithStartBoundary) {
        int indexSentenceWithEndBoundary = 0;
        for (int i = indexSentenceWithStartBoundary; i < sentences.length; i++) {
            if (sentences[i].hasEndBoundary(boundaries)) {
                indexSentenceWithEndBoundary = i;
                break;
            }
        }
        return indexSentenceWithEndBoundary;
    }

    private int getIndexSentenceWithStartBoundary(Boundaries boundaries) {
        int indexSentenceWithStartBoundary = 0;
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].hasStartBoundary(boundaries)) {
                indexSentenceWithStartBoundary = i;
                break;
            }
        }
        return indexSentenceWithStartBoundary;
    }
}
