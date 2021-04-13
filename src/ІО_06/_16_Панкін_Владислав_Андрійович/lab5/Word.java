package ІО_06._16_Панкін_Владислав_Андрійович.lab5;
import java.util.ArrayList;

public class Word {
    private ArrayList<Letter> letter = new ArrayList<Letter>();

    public Word(String word_string){
        for (int i=0; i < word_string.length(); i++)
            this.letter.add(new Letter(word_string.charAt(i)));
    }

    // метод повертає слово
    public String getWord(){
        StringBuffer word = new StringBuffer("");
        for (int i=0; i < letter.size(); i++)
            word.append(letter.get(i).getLetter());

        return word.toString();
    }

    // метод повертає кількість букв у слові
    public int GetLetterCount(){
        return letter.size();
    }

    // метод повертає букву слова по індексу
    public char GetWordLetter(int n){
        return letter.get(n).getLetter();
    }

    // метод повертає true якщо слово починається на голосну
    public boolean IsWordToVowel(){
        return letter.get(0).isVowelLetter();
    }
}
