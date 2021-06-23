package lab6;

import java.util.Scanner;

public class Client {
    private SweetsBox sweetsBox;

    public Client(SweetsBox sweetsBox) {
        this.sweetsBox = sweetsBox;
    }

    public void startProgram() {
        System.out.println("The box of sweets with different sweets:");
        System.out.println(sweetsBox);
        System.out.println("The box of sweets SORTED by price:");
        sweetsBox.sortSweetsInBoxByPrice();
        System.out.println(sweetsBox);
        System.out.println("Enter the percentage of chocolate you want:");
        Scanner sc = new Scanner(System.in);
        int chPerc = sc.nextInt();
        sweetsBox.findSweetsTypeByChocolate(chPerc);
        System.out.println("Done!");
    }
}
