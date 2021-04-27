package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Boeing_747 extends Plane {
    private static final String name = "Boeing 747";

    public Boeing_747(int year) {
        super(year, 425, 20, 9850, 10.2, 10668, 917);
    }

    public String getName() {
        return name;
    }
}

