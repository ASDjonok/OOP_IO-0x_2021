package Lab_6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Expansive expansive1 = new Expansive("Audi A7 45 TFSI quattro S line", 7, 250, 2315058.96);
        Expansive expansive2 = new Expansive("Bentley Continental R", 18, 245, 1586463.85);
        Expansive expansive3 = new Expansive("Mazda CX-9 2.5", 8, 210, 1199900.0);

        Cheap cheap1 = new Cheap("Daewoo Lanos 2006", 2, 150, 98579.92);
        Cheap cheap2 = new Cheap("TOYOTA RAV4", 5, 200, 700016.0);
        Cheap cheap3 = new Cheap("MITSUBISHI OUTLANDER SPORT SE 2015", 2, 190, 109533.24);

        Average average1 = new Average("Jaguar E-type 5.3", 20, 235, 33488.34);
        Average average2 = new Average("Volkswagen Beetle 2.0 TSI", 7, 226, 781672.46);
        Average average3 = new Average("BMW i8", 2, 260, 1182061.40);

        Car[] cars = {expansive1, expansive2, expansive3, cheap1, cheap2, cheap3, average1, average2, average3};

        TaxiStation station = new TaxiStation(cars);

        System.out.println("Доступні такі машини в таксопарку:");
        for (Car car : cars) {
            System.out.println(car.GetName());
        }
        System.out.println("\nВведіть назву машини, щоб подивитися її характеристики, або напишіть 'Продовжити'");
        String car_name = input.nextLine();
        while (!car_name.equalsIgnoreCase("продовжити")){
            int check = 0;
            for (Car car : cars) {
                if(car.GetName().equals(car_name)) {
                    check = 1;
                    System.out.println("Назва: " + car.GetName() + ". Витрата бензину (л/100км): " + car.GetPetrol() + ". Швидкість: " + car.GetSpeed() + ". Вартість: " + car.GetPrice());
                }
            }
            if(check == 0){
                System.out.println("Вибачте, такої машини в таксопарку немає");
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
        System.out.println("А тепер ти можеш дізнатися назву машини за її швидкістю! Якщо набридне - введи 'Стоп'. Поїхали!");
        String stop;
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
