package ІО_06._16_Панкін_Владислав_Андрійович.lab5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //Відсортувати слова заданого тексту, що починаються з голосних літер, за другою літерою.

        String text = "   Beautiful is \tbetter than ugly.\n" +
                "Explicit is better than implicit." + '\n'+
                "Simple is better than complex." + '\n'+
                "Complex is better than complicated." + '\n'+
                "Flat is better than nested." + '\n'+
                "Sparse is better than dense." + '\n'+
                "Readability counts."+ '\n' ;

//        String text = "   Відсортувати слова \tзаданого   тексту авжеж, що починаються з голосних \t\t літер, за другою літерою Автентично обміняти...";

        if ((text.substring(0).trim().equals(""))) {
            System.out.println("no text");
        } else {
			/*
			 * створюємо об'єкт класу Text, та передаємо йому текст, який
			 * складаєть з масиву об'ектів класу Sentence
			 */
            Text txt = new Text(text);
            System.out.println(txt.getText());
            System.out.println();

            txt.FindWordToVowel();
            System.out.println("до сортування");
            txt.PrintArrayWordToVowel();
            System.out.println();

            txt.SortArrayWordToVowel();

            System.out.println("після сортування");
            txt.PrintArrayWordToVowel();
            System.out.println();

        }
    }
}

