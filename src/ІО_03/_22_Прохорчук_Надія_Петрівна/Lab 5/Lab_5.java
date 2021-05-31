import java.util.Scanner;

public class Lab_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuffer text_to_print = new StringBuffer();
        String text;
        System.out.println("Введіть текст:");
        text = input.nextLine();
        String[] whole_text = text.split("(?<=[!.?])\\s?");

        for(String i : whole_text) {
            StringBuffer s  = new StringBuffer(i);
            Sentences sentence = new Sentences(s);
            text_to_print.append(sentence.split_into_words()).append(" ");
        }
        System.out.println("Відформатований текст:\n" + text_to_print);
    }
}

class Sentences {
    private final StringBuffer SENTENCES;

    public Sentences(StringBuffer SENTENCES){
        this.SENTENCES = SENTENCES;
    }

    public StringBuffer split_into_words(){
        StringBuffer sentence_to_return = new StringBuffer();
        String string_sentence = new String(SENTENCES);
        String[] words = string_sentence.split(" ");
        for(String i : words){
            StringBuffer w = new StringBuffer(i);
            Words word = new Words(w);
            sentence_to_return.append(word.split_into_letters()).append(" ");
        }
        return sentence_to_return;
    }
}

class Words {
    private final StringBuffer WORDS;

    public Words(StringBuffer WORDS){
        this.WORDS = WORDS;
    }

    public StringBuffer split_into_letters(){
        int index = 0;
        StringBuffer word_to_return = new StringBuffer();
        String string_word = new String(WORDS);
        StringBuffer word = new StringBuffer(string_word);
        char last_symbol;
        String[] letters = string_word.split("");
        last_symbol = word.charAt(word.length()-1);
        if(last_symbol==',' || last_symbol=='.' || last_symbol==':' || last_symbol==';' || last_symbol=='!' || last_symbol=='?' || last_symbol=='\"' || last_symbol=='»') {
            last_symbol = word.charAt(word.length() - 2);
            index+=1;
            if (last_symbol == '\"' || last_symbol == '»') {
                last_symbol = word.charAt(word.length() - 3);
                index+=2;
            } else if (last_symbol == '.') {
                last_symbol = word.charAt(word.length() - 4);
                index+=3;
            }
        }
        for(String i : letters){
            StringBuffer l = new StringBuffer(i);
            if(i.equals(",")  || i.equals(".") || i.equals(":") || i.equals(";") || i.equals("!") || i.equals("?") || i.equals("\"") || i.equals("»") || i.equals("«") || i.equals("-") || i.equals("'")) {
                Punctuation punctuation = new Punctuation(l);
                word_to_return.append(punctuation.get());
            }else {
                Letters symbols = new Letters(l, last_symbol, index, word.length());
                word_to_return.append(symbols.delete_symbols());
            }
            index++;
        }
        return word_to_return;
    }
}

class Letters {

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

class Punctuation {
    private final StringBuffer PUNCTUATION;

    public Punctuation(StringBuffer PUNCTUATION){
        this.PUNCTUATION = PUNCTUATION;
    }

    public StringBuffer get(){
        return PUNCTUATION;
    }
}
