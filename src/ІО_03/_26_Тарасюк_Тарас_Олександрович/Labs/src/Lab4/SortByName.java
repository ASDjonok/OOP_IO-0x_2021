package Lab4;

import java.util.Comparator;

public class SortByName implements Comparator<Equipment> {
    //o1 до o2 - зростання
    @Override
    public int compare(Equipment o1, Equipment o2) {
        return o2.name.compareTo(o1.name);
    }
}