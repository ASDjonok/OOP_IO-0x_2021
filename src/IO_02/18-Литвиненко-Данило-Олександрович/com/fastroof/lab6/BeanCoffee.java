package com.fastroof.lab6;

public class BeanCoffee extends Coffee {

    // На розчинну каву акція (у %)
    private int action;

    public BeanCoffee(String name, int quality, double price, double density, int action) {
        super(name, quality, price, density);
        this.action = action;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - action/100);
    }
}
