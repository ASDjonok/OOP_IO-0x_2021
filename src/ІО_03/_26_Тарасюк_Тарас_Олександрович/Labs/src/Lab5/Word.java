package Lab5;

public class Word implements SentenceMember{
    private Letter[] letters;

    public Word(String wordString){
        char[] chars = wordString.toCharArray();
        letters = new Letter[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }
    }

    @Override
    public String toString() {
        String wordString = "";
        for (Letter letter : letters) {
            wordString += letter;
        }
        return wordString;
    }




}
