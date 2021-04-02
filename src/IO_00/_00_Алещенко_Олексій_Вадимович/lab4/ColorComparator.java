package IO_00._00_Алещенко_Олексій_Вадимович.lab4;

import java.util.Comparator;

public class ColorComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
