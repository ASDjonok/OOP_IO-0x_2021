package ІО_03._26_Тарасюк_Тарас_Олександрович.Lab4.src.tarastaras.me;

import java.util.Comparator;

public class SortByName implements Comparator<Equipment> {
	//o1 до o2 - зростання
    @Override
    public int compare(Equipment o1, Equipment o2) {
        return o1.name.compareTo(o2.name);
    }
}