package Lab_5;

import java.util.Scanner;

public class Lab_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String main_text;
        System.out.println("Введіть текст:");
        main_text = input.nextLine();
        Text text = new Text(main_text);
        System.out.println("Змінений текст:");
        text.print();
    }
}
