package BRI_lab5;

import java.util.Arrays;
import java.util.Comparator;

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

    public String[][] doLabTask(char symbol) {
        String[][][] wordsInEverySentence = new String[sentences.length][][];
        for (int i = 0; i < sentences.length; i++) {
            wordsInEverySentence[i] = sentences[i].createArrayOfWordsForEverySentence(symbol);
        }

//        This loop returns number of all words
        int numberOfWords = 0;
        for (String[][] elements : wordsInEverySentence) {
            for (String[] element : elements) {
                numberOfWords++;
            }
        }

//        Make two-dimensional array from array created above to make sorting easier
        String[][] justWords = new String[numberOfWords][2];
        int indexOfArray = 0;
        for (String[][] elements : wordsInEverySentence) {
            for (String[] element : elements) {
                justWords[indexOfArray][0] = element[0];
                justWords[indexOfArray][1] = element[1];
                indexOfArray++;
            }
        }

//        Sorting an array by number of symbols in them
        Arrays.sort(justWords, Comparator.comparingInt(numberOfSymbols -> Integer.parseInt(numberOfSymbols[0])));

//        Return sorted array
        return justWords;
    }

    public void getResult(char symbol, String direction) {
        String[][] finalArray = doLabTask(symbol);
        if (direction.equalsIgnoreCase("ascending")) {
            for (String[] strings : finalArray) {
                System.out.print(strings[1] + " ");
            }
            System.out.println();
        } else if (direction.equalsIgnoreCase("descending")) {
            for (int i = finalArray.length - 1; i >= 0; i--) {
                System.out.print(finalArray[i][1] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Wrong direction of sorting was selected!");
        }
    }
}
