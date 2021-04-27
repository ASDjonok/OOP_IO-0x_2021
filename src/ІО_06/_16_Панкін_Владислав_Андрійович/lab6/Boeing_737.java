package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Boeing_737 extends Plane {
    private static final String name = "Boeing 737";

    public Boeing_737(int year) {
        super(year, 114, 2.4, 2518, 2.5, 10058, 793);
    }

    public String getName() {
        return name;
    }
}

