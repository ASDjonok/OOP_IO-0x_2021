package com.fastroof.lab5;

import java.util.ArrayList;

public class Lab5Main {
    public static void main(String[] args) {
        /*
        Модифікувати лабораторну роботу №3 наступним чином:
        для літер, (Letter)
        слів, (Word)
        речень, (Sentence)
        розділових знаків та (Punctuation)
        тексту (Text)
        створити окремі класи. Слово повинно складатися з масиву літер, речення з масиву слів та розділових знаків,
        текст з масиву речень. Замінити послідовність табуляцій та пробілів одним пробілом.

        Створити клас, який складається з виконавчого методу, що виконує описану дію з лабораторної роботи №3, але в
        якості типів використовує створені класи. Необхідно обробити всі виключні ситуації, що можуть виникнути під час
        виконання програмного коду. Всі змінні повинні бути описані та значення їх задані у виконавчому методі. Код
        повинен відповідати стандартам JCC та бути детально задокументований.
         */

        // Заданий рядок
        StringBuilder text = new StringBuilder("But I must explain to you how all this mistaken idea of denouncing " +
                "pleasure and praising pain was born and I will give you a complete account of the system, and " +
                "expound the actual teachings of the great explorer of the truth, the master of human " +
                "happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because " +
                "those who do not know how to pursue pleasure rationally encounter consequences that are extremely " +
                "painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because" +
                " it is pain, but because occasionally circumstances occur in which toil and pain can procure him " +
                "some great pleasure. To take a trivial example, which of us ever undertakes laborious physical " +
                "exercise, except to obtain some advantage from it? But who has any right to find fault with a man " +
                "who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that " +
                "produces no resultant pleasure?");

        // списки пунктуації, слів, літер
        ArrayList<Sentence> sentences = new ArrayList<>();
        ArrayList<Punctuation> punctuations = new ArrayList<>();
        ArrayList<Word> words = new ArrayList<>();
        ArrayList<Letter> letters = new ArrayList<>();
        String endOfSentencePunctuation = ".!?";

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isLetter(symbol)) {
                letters.add(new Letter(symbol));
            } else if (symbol == ' ') {
                if (letters.size() > 0) {
                    words.add(new Word(letters.toArray(new Letter[0])));
                }
                letters.clear();
            } else if (endOfSentencePunctuation.indexOf(symbol) != -1) {
                punctuations.add(new Punctuation(symbol, words.size()));
                words.add(new Word(letters.toArray(new Letter[0])));
                letters.clear();
                sentences.add(new Sentence(words.toArray(new Word[0]), punctuations.toArray(new Punctuation[0])));
                words.clear();
                punctuations.clear();
            } else {
                punctuations.add(new Punctuation(symbol, words.size()));
            }
        }

        Text newText = new Text(sentences.toArray(new Sentence[0]));
        System.out.println(newText.toString());

        // Довжина слів, які будуть замінені
        int l = 4;

        // Рядок на який заміняють слова заданої довжини
        for (char c : "ᕙ(⇀‸↼‶)ᕗ".toCharArray()) {
            letters.add(new Letter(c));
        }
        Word newStr = new Word(letters.toArray(new Letter[0]));

        for (Sentence sentence : newText.getSentences()) {
            Word[] aWords = sentence.getWords();
            for (int i = 0; i < aWords.length; i++) {
                if (aWords[i].toString().length() == l) {
                    aWords[i] = newStr;
                }
            }
        }
        System.out.println(newText.toString());

    }
}