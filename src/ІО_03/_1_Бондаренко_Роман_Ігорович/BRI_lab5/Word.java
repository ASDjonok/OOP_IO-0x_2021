package BRI_lab5;

public class Word implements SentenceMember {
    private Letter[] letters;
    private int counter;

    public Word(String wordString) {
        letters = new Letter[wordString.length()];
        for (int i = 0; i < wordString.length(); i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder finalWord = new StringBuilder();
        for (Letter letter : letters) {
            finalWord.append(letter);
        }
        return finalWord.toString();
    }

    public int check(char symbol) {
        for (Letter letter : letters) {
            if (letter.toString().indexOf(symbol) != -1) {
                counter++;
            }
        }
        return counter;
    }
}
