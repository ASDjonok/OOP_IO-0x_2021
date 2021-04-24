package BRI_lab5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\\/ Type some text below \\/");
        Text text = new Text(scanner.nextLine());
        System.out.println("\\/ Type a symbol below \\/");
        char symbol = scanner.next().charAt(0);

        text.getResult(symbol);
    }
}
