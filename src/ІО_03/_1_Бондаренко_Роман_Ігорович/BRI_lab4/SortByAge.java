package BRI_lab4;

import java.util.Comparator;

public class SortByAge implements Comparator<Boat> {
    @Override
    public int compare(Boat el1, Boat el2) {
        return el1.getAge()-el2.getAge();
    }
}
