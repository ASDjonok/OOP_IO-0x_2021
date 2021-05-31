import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Lab_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Car[] cars = {new Car("Audi A7 45 TFSI quattro S line", 7, 250, 2315058.96),
                new Car("BMW i8", 2, 250, 1182061.40),
                new Car("Bentley Continental R", 18, 245, 1586463.85),
                new Car("Volkswagen Beetle 2.0 TSI", 7, 226, 781672.46),
                new Car("Mazda CX-9 2.5", 8, 210, 1199900.0),
                new Car("Jaguar E-type 5.3", 20, 235, 33488.34)};
        TaxiStation station = new TaxiStation(cars);

        System.out.println("Доступні такі машини в таксопарку:");
        for (Car car : cars) {
            System.out.println(car.GetName());
        }
        System.out.println("\nВведіть назву машини, щоб подивитися її характеристики, або напишіть 'Продовжити'");
        String car_name = input.nextLine();
        while (!car_name.equalsIgnoreCase("продовжити")){
            for (Car car : cars) {
                if(car.GetName().equals(car_name)) {
                    System.out.println("Назва: " + car.GetName() + ". Витрата бензину (л/100км): " + car.GetPetrol() + ". Швидкість: " + car.GetSpeed() + ". Вартість: " + car.GetPrice());
                }
            }
            car_name = input.nextLine();
        }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Ціна всіх автомобілей в таксопарку складає: " + station.SumPrice() + " гривень");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Відсортований таксопарк за кількістю витраченого бензину на 100 км:");

        Arrays.sort(cars, new SortByPetrol());
        for (Car car : cars) {
            System.out.println("Витрата бензину (л/100км): " + car.GetPetrol() + ". Назва: " + car.GetName() + ". Швидкість: " + car.GetSpeed() + ". Вартість: " + car.GetPrice());
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("А тепер ти можеш дізнатися назву машини за її швидкістю! Якщо набридне - введи 'Стоп'. Поїхали? То введи будь-яке слово!");
        String stop = input.nextLine();
        while (true){
            System.out.println("Введіть мінімальну швидкість:");
            int bottom = 0;
            try{
                bottom = input.nextInt();
            }catch (Exception InputMismatchException){
                stop = input.nextLine();
                if(stop.equalsIgnoreCase("стоп")){
                    break;
                }
            }

            System.out.println("Введіть максимальну швидкість:");
            int top = 0;
            try{
                top = input.nextInt();
            }catch (Exception InputMismatchException){
                stop = input.nextLine();
                if(stop.equalsIgnoreCase("стоп")){
                    break;
                }
            }
            String name;
            name = station.foundSpeed(bottom, top);
            if (name.equals("")){
                name = "Вибачте, такої машини в таксопарку немає";
            }
            System.out.println(name);
        }

    }
}

class TaxiStation{
    private final Car[] CARS;

    public TaxiStation(Car[] CARS){
        this.CARS = CARS;
    }

    public double SumPrice(){
        double sum = 0;
        for (Car car : CARS) {
            sum += car.GetPrice();
        }
        return sum;
    }

    public String foundSpeed(int low, int height){
        String my_car = "";
        for (Car car : CARS) {
            if(car.GetSpeed()>low&&car.GetSpeed()<height){
                my_car = car.GetName();
                break;
            }
        }
        return my_car;
    }
}

class Car {
    private final String NAME;
    private final int PETROL;
    private final int SPEED;
    private final double PRICE;

    public Car(String NAME, int PETROL, int SPEED, double PRICE){
        this.NAME = NAME;
        this.PETROL = PETROL;
        this.SPEED = SPEED;
        this.PRICE = PRICE;
    }

    public String GetName(){
        return NAME;
    }

    public int GetPetrol(){
        return PETROL;
    }

    public int GetSpeed(){
        return SPEED;
    }

    public double GetPrice(){
        return PRICE;
    }

}

class SortByPetrol implements Comparator<Car>{
    public int compare(Car one, Car two){
        return one.GetPetrol()-two.GetPetrol();
    }
}