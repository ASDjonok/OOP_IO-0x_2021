package lab6;

import java.util.Comparator;

public class SortWeight implements Comparator<Armor> {
	public int compare(Armor obj1, Armor obj2) {
		if (obj1.GetWeight() < obj2.GetWeight()) return -1;
		if (obj1.GetWeight() > obj2.GetWeight()) return 1;
		return 0;
	}
}
