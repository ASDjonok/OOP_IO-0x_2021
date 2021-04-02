package ІО_06._16_Панкін_Владислав_Андрійович.lab4;

import java.util.Comparator;
public class ByType implements Comparator<Plane> {
	@Override
	public int compare(Plane p1, Plane p2){
		return p1.getType().compareToIgnoreCase(p2.getType());
	}
}
