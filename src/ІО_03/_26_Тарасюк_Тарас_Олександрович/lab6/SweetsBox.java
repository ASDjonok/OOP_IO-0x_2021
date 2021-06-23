package lab6;

import java.util.*;

public class SweetsBox {
    private Sweets[] sweets;
    private int sweetBoxWeight;

    public SweetsBox(Sweets[] sweets) {
        this.sweets = sweets;
        for (Sweets sweet : this.sweets){
            sweetBoxWeight += sweet.getKgQuantity();
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Sweets sweet : sweets) {
            output+= sweet.toString() + "\n";
        }
        return "SweetsBox{" +
                "\n" + output +
                "sweetBoxWeight=" + sweetBoxWeight +
                '}' + "\n";
    }

    public void sortSweetsInBoxByPrice() {
        List<Sweets> sweetsList = new ArrayList();
        for (Sweets sweet : sweets) {
            sweetsList.add(sweet);
        }
        sweetsList.sort(Comparator.comparing(Sweets::getTotalPrice));
        this.sweets = sweetsList.toArray(new Sweets[0]);
    }

    public void findSweetsTypeByChocolate(int chPerc) {
        boolean checker = false;
        for (Sweets sweet : sweets) {
            if (sweet.getChocolatePercentage() == chPerc) {
                checker = true;
                System.out.println(sweet);
            }
        }

        if (!checker) {
            System.out.println("There are no sweets with such percentage of chocolate!");
        }
    }
}
