package BRI_lab4;

public class Boat {
    private final String name;
    private final String manufacturedIn;
    private final String type;
    private final int age;
    private final int tonnage;
    private final int price;

    public Boat(String name, String manufacturedIn, String type, int age, int tonnage, int price) {
        this.name = name;
        this.manufacturedIn = manufacturedIn;
        this.type = type;
        this.age = age;
        this.tonnage = tonnage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufacturedIn() {
        return manufacturedIn;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getTonnage() {
        return tonnage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Boat: " +
                "name = '" + name + '\'' +
                ", manufacturedIn = '" + manufacturedIn + '\'' +
                ", type = '" + type + '\'' +
                ", age = " + age +
                ", tonnage = " + tonnage +
                ", price = " + price;
    }
}
