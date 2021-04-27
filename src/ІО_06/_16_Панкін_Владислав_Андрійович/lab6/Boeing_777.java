package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Boeing_777 extends Plane {
    private static final String name = "Boeing 777";

    public Boeing_777(int year) {
        super(year, 235, 20, 7406, 7, 10668, 891);
    }

    public String getName() {
        return name;
    }
}

