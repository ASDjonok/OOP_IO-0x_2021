package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Airbus_A310 extends Plane {
    private static final String name = "Airbus A310";

    public Airbus_A310(int year) {
        super(year, 187, 0, 4600, 4.4, 12200, 850);
    }

    public String getName() {
        return name;
    }
}
