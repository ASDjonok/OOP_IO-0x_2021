package Lab_4;

import java.util.Arrays;
import java.util.Comparator;

public class Lab_4 {
    public static void main(String[] args) {

        //створюємо об\'єкти класу Літаки. Кожен літак має такі параметри як назва, маса тощо. Ці параметри - це поля класа Літаки
        Airplanes plane1 = new Airplanes("Як-52", 1015, 7.52, 2, 285);
        Airplanes plane2 = new Airplanes("Су-25К", 9315, 15.36, 1, 950);
        Airplanes plane3 = new Airplanes("МиГ-29", 11000, 17.0, 2, 2446);
        Airplanes plane4 = new Airplanes("Ил-76", 72000, 47.0, 10, 800);
        Airplanes plane5 = new Airplanes("Boeing 747-400", 178800, 70.6, 500, 988);
        Airplanes plane6 = new Airplanes("Ла-7", 2605, 8.67, 1, 597);
        //створюємо масив з об\'єктів класу Літаки
        Airplanes[] air_list = {plane1, plane2, plane3, plane4, plane5, plane6};

        //викликаємо метод, що відсортовує наш масив по певному полю за збільшенням
        System.out.println("Відсортовано за збільшенням:");
        Arrays.sort(air_list, Airplanes.sortCountOfMass);
        for (int i = 0; i < 6; i++) {
            System.out.println("Назва: " + air_list[i].getName() + ". Маса: " + air_list[i].getMass() + ". Довжина: " + air_list[i].getLength() + ". Кількість місць: " + air_list[i].getPlaces() + ". Швидкість: " + air_list[i].getSpeed());
        }

        //викликаємо метод, що відсортовує наш масив по певному полю за зменшенням
        System.out.println("\nВідсортовано за зменшенням:");
        Arrays.sort(air_list, Airplanes.sortCountOfLength);
        for (int i = 0; i < 6; i++) {
            System.out.println("Назва: " + air_list[i].getName() + ". Маса: " + air_list[i].getMass() + ". Довжина: " + air_list[i].getLength() + ". Кількість місць: " + air_list[i].getPlaces() + ". Швидкість: " + air_list[i].getSpeed());
        }
    }
}

//створюємо клас Літаки
class Airplanes {
    //оголошуємо поля та створюємо конструктор
    private String name;
    private int mass;
    private double length;
    private int places;
    private int speed;

    public Airplanes(String name, int mass, double length, int places, int speed) {
        this.name = name;
        this.mass = mass;
        this.length = length;
        this.places = places;
        this.speed = speed;
    }

    //прописуємо методи, що будуть повертати значення полів класу
    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public double getLength() {
        return length;
    }

    public int getPlaces() {
        return places;
    }

    public int getSpeed() {
        return speed;
    }

    //сортуємо через компаратор об\'єкт по масі
    public static Comparator<Airplanes> sortCountOfMass = Comparator.comparingInt(Airplanes::getMass);
    //сортуємо через компаратор об\'єкт по довжині
    public static Comparator<Airplanes> sortCountOfLength = Comparator.comparingDouble(Airplanes::getLength).reversed();

}
