package ІО_06._16_Панкін_Владислав_Андрійович.lab4;

import java.util.Comparator;

public class ByAmount implements Comparator<Plane> {
	@Override
	public int compare(Plane p1, Plane p2) {
		return p2.AmountOfEngines - p1.AmountOfEngines;
	}
}
