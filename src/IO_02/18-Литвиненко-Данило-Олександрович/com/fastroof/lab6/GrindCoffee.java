package com.fastroof.lab6;

public class GrindCoffee extends Coffee {

    // Є шанс браку (при браці товар обезцінюється)
    private boolean defect;

    public GrindCoffee(String name, int quality, double price, double density, boolean defect) {
        super(name, quality, price, density);
        this.defect = defect;
    }

    @Override
    public double getPrice() {
        return defect ? 0 : super.getPrice();
    }
}
