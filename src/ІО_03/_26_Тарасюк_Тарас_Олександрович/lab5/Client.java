package lab5;

import java.util.Scanner;

public class Client {
    private Text text;

    public Client(Text text) {
        this.text = text;
    }

    public void startProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть довжину шуканих слів:");
        int n = sc.nextInt();

        text.doLabTask(n);


        if (text.getWantedWords() == null){
            System.out.println("У питальних речення заданого тексту немає слів з довжиною "+n+"!");
        } else {
            System.out.println("Унікальні слова з питальних речень заданого тексту з довжиною "+n+":");
            System.out.println(text.getWantedWords());
        }

    }
}
