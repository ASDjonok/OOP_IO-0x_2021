package Lab_5;

public class Letters {
    private final StringBuffer LETTER;
    private final char LAST_LETTER;
    private final int INDEX;
    private final int LENGTH;

    public Letters(StringBuffer LETTER, char LAST_LETTER, int INDEX, int LENGTH){
        this.LETTER = LETTER;
        this.LAST_LETTER = LAST_LETTER;
        this.INDEX = INDEX;
        this.LENGTH = LENGTH;
    }

    public StringBuffer delete_symbols(){
        char letter;
        letter = LETTER.charAt(0);
        if(Character.toLowerCase(letter) == Character.toLowerCase(LAST_LETTER) && INDEX!=LENGTH-1){
            LETTER.deleteCharAt(0);
        }
        return LETTER;
    }
}
