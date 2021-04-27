package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Main {

    public static void main(String[] args) {
        Airline MAU = new Airline("МАУ", 7);

        System.out.println(" ");
        System.out.println("Загальна місткість авіакомпанії " + MAU.getName() + ": " + MAU.getAirlineNumber_of_places());
        System.out.println("Загальна вантажопідйомність авіакомпанії " + MAU.getName() + ": " + MAU.getAirlineWeight_of_cargo());
        System.out.println(" ");
        System.out.println("Літаки авіакомпанії до сортування:");
        MAU.display();
        MAU.sort();
        System.out.println(" ");
        System.out.println("Літаки авіакомпанії після сортування:");
        MAU.display();
        System.out.println(" ");
        MAU.getPlaneInFuelConsumptionRange(2, 5);
    }
}
