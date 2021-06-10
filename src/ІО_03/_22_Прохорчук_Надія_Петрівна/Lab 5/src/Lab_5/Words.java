package Lab_5;

public class Words {
    private final StringBuffer A_WORD = new StringBuffer();

    public Words(String word){
        int index = 0;
        StringBuffer words = new StringBuffer(word);
        char last_symbol;
        String[] letters_massive = word.split("");
        last_symbol = words.charAt(words.length()-1);
        if(last_symbol==',' || last_symbol=='.' || last_symbol==':' || last_symbol==';' || last_symbol=='!' || last_symbol=='?' || last_symbol=='\"' || last_symbol=='»') {
            last_symbol = words.charAt(words.length() - 2);
            index+=1;
            if (last_symbol == '\"' || last_symbol == '»') {
                last_symbol = words.charAt(words.length() - 3);
                index+=2;
            } else if (last_symbol == '.') {
                last_symbol = words.charAt(words.length() - 4);
                index+=3;
            }
        }
        for(String i : letters_massive){
            StringBuffer l = new StringBuffer(i);
            if(i.equals(",")  || i.equals(".") || i.equals(":") || i.equals(";") || i.equals("!") || i.equals("?") || i.equals("\"") || i.equals("»") || i.equals("«") || i.equals("-")) {
                Punctuation punctuation = new Punctuation(l);
                A_WORD.append(punctuation.get());
            }else {
                Letters symbols = new Letters(l, last_symbol, index, words.length());
                A_WORD.append(symbols.delete_symbols());
            }
            index++;
        }
    }

    public StringBuffer get(){
        return A_WORD;
    }
}
