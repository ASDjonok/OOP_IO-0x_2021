package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Airbus_A330 extends Plane {
    private static final String name = "Airbus A330";

    public Airbus_A330(int year) {
        super(year, 440, 0, 11900, 6.4, 12500, 925);
    }

    public String getName() {
        return name;
    }
}

