package com.fastroof.lab6;

public class Coffee {
    /** Назва сорту кави */
    private String name;

    /** Якість кави*/
    private int quality;

    /** Ціна кілограма кави */
    private double price;

    /** Густина кави */
    private double density;

    public Coffee(String name, int quality, double price, double density) {
        this.name = name;
        this.quality = quality;
        this.price = price;
        this.density = density;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", quality=" + quality +
                ", price=" + String.format("%.2f", getPrice()) + " грн/кг";
    }
}
