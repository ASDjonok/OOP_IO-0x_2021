package Lab4;

import java.util.Comparator;

public class SortByPrice implements Comparator<Equipment> {
    @Override
    public int compare(Equipment o1, Equipment o2) {
//    	if(o2.price == o1.price) {
//    		return o1.name.compareTo(o2.name);
//    	}
        return o1.price-o2.price;
    }

}
