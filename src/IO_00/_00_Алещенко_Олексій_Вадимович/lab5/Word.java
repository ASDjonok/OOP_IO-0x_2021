package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.ArrayList;
import java.util.Arrays;

public class Word /*extends*/ implements SentenceMember {
    //    todo remove this field in a final version
//    private String wordString;
    private Letter[] letters;

    public Word(String wordString) {
        letters = new Letter[wordString.length()];
        for (int i = 0; i < wordString.length(); i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
//        this.wordString = wordString;
        /*char[] chars = wordString.toCharArray();
//        letters = new Letter[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }*/
    }

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    static class Interval {
        private int startInterval;
        private int endInterval;

        public Interval(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    //    todo think about using array
    public static void findLargestPalindromicSubstring(ArrayList<Word> words) {
        final Letter[] allLetters = extractLetters(words);
        final Interval largestPalindromicSubArray = findLargestPalindromicSubArray(allLetters, allLetters.length);
//        PalindromeCoordinate palindromeCoordinate = new PalindromeCoordinate(1, 1);
//        Word.findLargestPalindromicSubstring(words);
    }

    private static Interval findLargestPalindromicSubArray(Letter[] letters, int searchIntervalLength) {
        Interval searchInterval;
        for (int i = 0; i <= letters.length - searchIntervalLength; i++) {
            searchInterval = new Interval(i, i + searchIntervalLength);
            if (isPalindrome(letters, searchInterval)) return searchInterval;
        }

//        todo fix magic number
        if (searchIntervalLength > 3 ) {
            findLargestPalindromicSubArray(letters, searchIntervalLength - 1);
        }

        return null;
    }

    private static boolean isPalindrome(Letter[] letters, Interval searchInterval) {
        int startInterval = searchInterval.startInterval;
        int endInterval = searchInterval.endInterval;
        Letter startLetter;
        Letter endLetter;
        while (startInterval < endInterval) {
            startLetter = letters[startInterval];
//            todo !!! fix ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
            endLetter = letters[endInterval];
            if (!startLetter.equalsIgnoreCase(endLetter)) {
                return false;
            }
            startInterval++;
            endInterval--;
        }
        return true;
    }

    private static Letter[] extractLetters(ArrayList<Word> words) {
        ArrayList<Letter> allLetters = new ArrayList<>();
        for (Word word : words) {
            allLetters.addAll(Arrays.asList(word.letters));
            /*for (Letter letter : word.allLetters) {
                allLetters.add(letter);
            }*/
//            allLetters.addAll(word.getLetters());
        }
//        return (Letter[]) allLetters.toArray();
        return allLetters.toArray(new Letter[allLetters.size()]);
    }
/*
    private Collection<Letter> getLetters() {
        ArrayList<Letter> words = new ArrayList<>();
        for (SentenceMember sentenceMember : sentenceMembers) {
            //    todo think about using "instanceof"
            if (sentenceMember instanceof Word) {
                words.add((Word) sentenceMember);
            }
        }
        return words;
    }*/

    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters) {
            wordString.append(letter);
        }
        return wordString.toString();
    }
}
