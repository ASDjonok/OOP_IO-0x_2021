package ІО_06._16_Панкін_Владислав_Андрійович.lab5;

import java.util.ArrayList;
import java.util.*;

public class Text {
    private String text;
    private ArrayList<Sentence> sentence = new ArrayList<Sentence>();
    private ArrayList<Word> WordToVowel = new ArrayList<Word>();


    Text(String atext) {
        text = atext;
        int i;
        int j = 0;
        text=text.replaceAll("\\t", " "); // виконуємо заміну послідовності табуляцій одним пробілом
        text=text.replaceAll("[\\s]{2,}", " ");
        text=text.trim();
        i = 0;
		/*
		 * додаємо кожне речення як елемент ArrayList sentenses
		 */
        for (j = 0; j < text.length(); j++) {
            if (text.charAt(j) == '.') {
                if ((j > 1) && (j < text.length() - 2)) {
                    if ((text.charAt(j + 1) == '.') && (text.charAt(j + 2) == '.')) {
                        this.sentence.add(new Sentence(text.substring(i, j + 3)));
                        i = j + 3;
                        j = j + 2;
                    }
                    else{
                        this.sentence.add(new Sentence(text.substring(i, j + 1)));
                        i = j + 2;
                    }
                }else{
                        this.sentence.add(new Sentence(text.substring(i, j + 1)));
                        i = j + 2;
                }
            } else if ((text.charAt(j) == '?') | (text.charAt(j) == '!')) {
                this.sentence.add(new Sentence(text.substring(i, j + 1)));
                i = j + 2;
            }
        }
    }

    // метод повертає весь текст
    public String getText() {
        return text;
    }

    // метод формує список слів, які починаються на голосну
    public void FindWordToVowel(){
        if (!sentence.isEmpty()) {
            if (!WordToVowel.isEmpty())
                WordToVowel.clear();

            for (int i = 0; i < sentence.size(); i++) {
                WordToVowel.addAll(sentence.get(i).GetWordToVowel());
            }
        }
    }

    // метод виводить список слів, які починаються на голосну
    public void PrintArrayWordToVowel(){
        for (int i = 0; i < WordToVowel.size(); i++){
            System.out.println(WordToVowel.get(i).getWord());
        }
    }

    // метод сортує список слів, які починаються на голосну
    public void SortArrayWordToVowel(){
        LetterComparator comp = new LetterComparator();
        Collections.sort(WordToVowel,comp);

    }
}