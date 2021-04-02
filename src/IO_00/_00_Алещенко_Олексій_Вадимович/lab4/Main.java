package IO_00._00_Алещенко_Олексій_Вадимович.lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        /*System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);*/
        /*System.out.println('і' < 'я');
        System.out.println((int)'і');*/

        int[] array = {1, 3, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Car[] cars = {
                new Car("White", 1, BodyType.CROSSOVER),
                new Car("Black", 2, BodyType.CROSSOVER),
                new Car("Black", 1, BodyType.CROSSOVER),
        };

//        System.out.println(cars[0].compareTo(cars[1]));
//        System.out.println(cars[0].compareTo("A"));

//        Arrays.sort(cars/*, Comparator.comparing(Car)*/);

        Arrays.sort(cars,
                Comparator
                        .comparingInt(Car::getPaintLayerThickness)
                        .thenComparing(Comparator.comparing(Car::getColor).reversed())
        );
        /*Arrays.sort(cars,
                Comparator
                        .comparingInt(Car::getPaintLayerThickness)
                        .thenComparing(Car::getColor)
                        .reversed()
        );*/
        /*Arrays.sort(cars,
                Comparator
                        .comparingInt(Car::getPaintLayerThickness).reversed()
                        .thenComparing(Car::getColor));*/
        /*Arrays.sort(cars, (o1, o2) ->
                Integer.compare(o1.getPaintLayerThickness(), o2.getPaintLayerThickness()));*/
        /*Arrays.sort(cars, (o1, o2) ->
                {
                    System.out.println(":)");
                    return Integer.compare(o1.getPaintLayerThickness(), o2.getPaintLayerThickness())
                }
        );*/
        /*Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getPaintLayerThickness(), o2.getPaintLayerThickness());
            }
        });*/

        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("================");

        Arrays.sort(cars, new ColorComparator().reversed());

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
