package ІО_06._16_Панкін_Владислав_Андрійович.lab3;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        /*
          C3 = 1   StringBuffer
          C17 = 7  Відсортувати слова заданого тексту, що починаються з голосних літер, за другою літерою.
        */

        int NZK = 619;
        int C3 = NZK % 3;
        int C17 = NZK % 17;
        System.out.println("C3 = " + C3);
        System.out.println("C17 = " + C17);

        StringBuffer Text = new StringBuffer("Відсортувати слова заданого тексту авжеж, що починаються з голосних літер, за другою літерою Автентично обміняти.");
        StringBuffer Word = new StringBuffer("");

        ArrayList<String> WordsList = new ArrayList<>(); //список слів, які починаються з голосних

        int i = 0;
        while (i < Text.length()){
            while (i < Text.length() && ((Text.charAt(i)==',')||(Text.charAt(i)=='.')||(Text.charAt(i)=='!')||(Text.charAt(i)==' ')||(Text.charAt(i)=='?')||(Text.charAt(i)==';')||(Text.charAt(i)==':'))){ //пропускаем последовательность знаков
                i++;
            }
            Word.delete(0,Word.length());
            while (i < Text.length() && (Text.charAt(i)!=',')&&(Text.charAt(i)!='.')&&(Text.charAt(i)!='!')&&(Text.charAt(i)!=' ')&&(Text.charAt(i)!='?')&&(Text.charAt(i)!=';')&&(Text.charAt(i)!=':')){ //собираем слово до следующего знака
                Word.append(Text.charAt(i));
                i++;
            }
            if (!Word.isEmpty()){
                if ((Word.charAt(0)=='e')||(Word.charAt(0)=='y')||(Word.charAt(0)=='u')||(Word.charAt(0)=='i')||(Word.charAt(0)=='o')||(Word.charAt(0)=='a')||
                    (Word.charAt(0)=='у')||(Word.charAt(0)=='е')||(Word.charAt(0)=='а')||(Word.charAt(0)=='о')||(Word.charAt(0)=='я')||(Word.charAt(0)=='и')||(Word.charAt(0)=='ю')||
                    (Word.charAt(0)=='э')||(Word.charAt(0)=='ё')||(Word.charAt(0)=='ы')||
                    (Word.charAt(0)=='E')||(Word.charAt(0)=='Y')||(Word.charAt(0)=='U')||(Word.charAt(0)=='I')||(Word.charAt(0)=='O')||(Word.charAt(0)=='A')||
                    (Word.charAt(0)=='У')||(Word.charAt(0)=='Е')||(Word.charAt(0)=='А')||(Word.charAt(0)=='О')||(Word.charAt(0)=='Я')||(Word.charAt(0)=='И')||(Word.charAt(0)=='Ю')||
                    (Word.charAt(0)=='Э')||(Word.charAt(0)=='Ё')||(Word.charAt(0)=='Ы'))
                        WordsList.add(Word.toString());
            }
        }

        System.out.println("до сортування");
        System.out.println(WordsList);

        //первый метод сортировки
        LetterComparator comp = new LetterComparator();
        Collections.sort(WordsList,comp);

        //второй метод сортировки
//        for(i=0; i<WordsList.size()-1; i++) {
//            for (int j = i + 1; j < WordsList.size(); j++) {
//                if (WordsList.get(i).length() >= 2 && WordsList.get(j).length() >= 2) { //у обоих слов есть второй символ, сортируем по нему
//                    if (WordsList.get(i).charAt(1) > WordsList.get(j).charAt(1)) {
//                        String temp = WordsList.get(i);
//                        WordsList.set(i, WordsList.get(j));
//                        WordsList.set(j, temp);
//                    }
//                } else if (WordsList.get(i).length() < 2 && WordsList.get(j).length() < 2) { //оба слова состоят из 1 символа, сортируем по нему
//                    if (WordsList.get(i).charAt(WordsList.get(i).length() - 1) > WordsList.get(j).charAt(WordsList.get(j).length() - 1)) {
//                        String temp = WordsList.get(i);
//                        WordsList.set(i, WordsList.get(j));
//                        WordsList.set(j, temp);
//                    }
//                } else if (WordsList.get(i).length() < 2 && WordsList.get(j).length() >= 2) {//первое слово из 1 символа, сортируем по нему, второе слово по второму символу
//                    if (WordsList.get(i).charAt(WordsList.get(i).length() - 1) > WordsList.get(j).charAt(1)) {
//                        String temp = WordsList.get(i);
//                        WordsList.set(i, WordsList.get(j));
//                        WordsList.set(j, temp);
//                    }
//                } else if (WordsList.get(i).length() >= 2 && WordsList.get(j).length() < 2) {//первое слово по второму символу, второе слово из 1 символа, сортируем по нему
//                    if (WordsList.get(i).charAt(1) > WordsList.get(j).charAt(WordsList.get(j).length() - 1)) {
//                        String temp = WordsList.get(i);
//                        WordsList.set(i, WordsList.get(j));
//                        WordsList.set(j, temp);
//                    }
//                }
//            }
//        }
//
        System.out.println(" ");
        System.out.println("після сортування");
        System.out.println(WordsList);


    }
}



