package BRI_lab5;

public class Word implements SentenceMember {
    private Letter[] letters;

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

    public int countSymbolsInWord(char symbol) {
        int counter = 0;
        for (Letter letter : letters) {
            if (letter.toString().equalsIgnoreCase(String.valueOf(symbol))) {
                counter++;
            }
        }
        return counter;
    }
}
