package IO_00._00_Алещенко_Олексій_Вадимович.lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Car[] cars = {
                new Car("Pink", 1, BodyType.CROSSOVER),
                new Car("Black", 1, BodyType.CROSSOVER),
                new Car("White", 1, BodyType.CROSSOVER),
        };

//        System.out.println(cars[0].compareTo(cars[1]));
//        System.out.println(cars[0].compareTo("A"));

        Arrays.sort(cars/*, Comparator.comparing(Car)*/);
//        System.out.println(Arrays.toString(cars));
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        /*Car car;
        car = new Car("Pink", 1, BodyType.CROSSOVER);
        Car car2 = new Car();*/


//        car.color = "Pink";
        /*car.setColor("Pink");
//        System.out.println(car.color.length());
        car.setBodyType(BodyType.SEDAN);
        System.out.println(car.getBodyType());*/
    }
}
