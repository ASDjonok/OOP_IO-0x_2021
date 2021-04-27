package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Airbus_A320 extends Plane {
    private static final String name = "Airbus A320";

    public Airbus_A320(int year) {
        super(year, 259, 0, 6100, 2.5, 10668, 853);
    }

    public String getName() {
        return name;
    }
}

