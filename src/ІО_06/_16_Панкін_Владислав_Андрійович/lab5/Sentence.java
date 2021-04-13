package ІО_06._16_Панкін_Владислав_Андрійович.lab5;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private ArrayList<Word> word = new ArrayList<Word>();
    private ArrayList<Punktuatoin> punktuatoin = new ArrayList<Punktuatoin>();

    public Sentence(String sentence_string) {
        sentence_string = new String(sentence_string.trim());
        StringBuffer Wd = new StringBuffer("");
        int i = 0;
        while (i < sentence_string.length()) {
            while (i < sentence_string.length() && ((sentence_string.charAt(i) == ',') || (sentence_string.charAt(i) == '.') ||
                    (sentence_string.charAt(i) == '!') || (sentence_string.charAt(i) == ' ') || (sentence_string.charAt(i) == '?') ||
                    (sentence_string.charAt(i) == ';') || (sentence_string.charAt(i) == ':'))) { //пропускаем последовательность знаков
                if (sentence_string.charAt(i) != ' ')
                    this.punktuatoin.add(new Punktuatoin(sentence_string.charAt(i)));
                i++;
            }
            Wd.delete(0, Wd.length());
            while (i < sentence_string.length() && (sentence_string.charAt(i) != ',') && (sentence_string.charAt(i) != '.') &&
                    (sentence_string.charAt(i) != '!') && (sentence_string.charAt(i) != ' ') && (sentence_string.charAt(i) != '?') &&
                    (sentence_string.charAt(i) != ';') && (sentence_string.charAt(i) != ':')) { //собираем слово до следующего знака
                Wd.append(sentence_string.charAt(i));
                i++;
            }
            if (!Wd.isEmpty()) {
                this.word.add(new Word(Wd.toString()));
            }
        }
    }

    // метод повертає масив слів речення, які починаються з голосної
    public ArrayList GetWordToVowel(){
        ArrayList<Word> tmp = new ArrayList<Word>();

        for (int i =0; i < word.size(); i++){
            if (word.get(i).IsWordToVowel())
                tmp.add(word.get(i));

        }
        return tmp;
    }
}
