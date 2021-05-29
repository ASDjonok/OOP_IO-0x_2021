package BRI_lab6;

import java.util.Comparator;

public class SortByPower implements Comparator<ElectricalAppliance> {
    @Override
    public int compare(ElectricalAppliance one, ElectricalAppliance two) {
        return one.getPower() - two.getPower();
    }
}
