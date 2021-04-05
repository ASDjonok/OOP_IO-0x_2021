package com.fastroof.lab6;

public class InstantCoffee extends Coffee{

    private final Case form;

    public InstantCoffee(String name, int quality, double price, double density, Case form) {
        super(name, quality, price, density);
        this.form = form;
    }

    public double getInCasePrice() {
        return getPrice() * getDensity() * form.getVolume() + form.getPrice();
    }

    @Override
    public String toString() {
        return  "name='" + getName() + '\'' +
                ", quality=" + getQuality() +
                ", price=" + String.format("%.2f", getInCasePrice()) + " грн/" + form.getTitle();
    }

}
