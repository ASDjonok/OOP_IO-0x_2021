package tarastaras.me;

import java.util.Comparator;

public class SortByPriceDescending implements Comparator<Equipment> {
	//o2 до o1 - спадання
    @Override
    public int compare(Equipment o1, Equipment o2) {
//    	if(o2.price == o1.price) {
//    		return o1.name.compareTo(o2.name);
//    	}
        return o2.price-o1.price;
    }
    
}
