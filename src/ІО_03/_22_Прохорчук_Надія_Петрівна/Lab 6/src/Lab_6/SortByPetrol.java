package Lab_6;

import java.util.Comparator;

class SortByPetrol implements Comparator<Car> {
    public int compare(Car one, Car two){
        return one.GetPetrol()-two.GetPetrol();
    }
}
