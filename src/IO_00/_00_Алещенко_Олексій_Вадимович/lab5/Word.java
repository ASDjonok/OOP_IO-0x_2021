package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.ArrayList;

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

//    todo think about using array
    public static void findLargestPalindromicSubstring(ArrayList<Word> words) {
    }

    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters) {
            wordString.append(letter);
        }
        return wordString.toString();
    }
}
