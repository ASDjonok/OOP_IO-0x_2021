package BRI_lab5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\\/ Type some text below \\/");
        Text text = new Text(scanner.nextLine());
//        System.out.println("\\/ Enter a symbol you want \\/");
//        String symbol = scanner.next();

        System.out.println(text);

//        System.out.println(text.countYourSymbolInEverySentence(symbol));
    }
}
