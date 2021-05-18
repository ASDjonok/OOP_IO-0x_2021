package BRI_lab5;

import java.util.Scanner;

public class Client {

    public void doLabTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\\/ Type some text below \\/");
        Text text = new Text(scanner.nextLine());
        System.out.println("\\/ Type a symbol below \\/");
        char symbol = scanner.next().charAt(0);
        System.out.println("""
                Choose the direction of sorting:
                1. Ascending
                2. Descending""");
        System.out.print("Your selection: ");
        String direction = scanner.next();
        System.out.println("\\/ Words with symbol '" + symbol + "' sorted by " + direction + " are below \\/");
        text.getResult(symbol, direction);
    }
}
