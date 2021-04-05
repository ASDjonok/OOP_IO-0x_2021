package com.fastroof.lab6;

public class Case {
    /** Назва упаковки*/
    private String title;

    /** Ціна одного контейнера */
    private double price;

    /** Вага контейнера */
    private double weight;

    /** Об'єм контейнера */
    private double volume;

    /**
     *
     * @param title
     * @param price
     * @param weight
     * @param volume
     */
    public Case(String title, double price, double weight, double volume) {
        this.title = title;
        this.price = price;
        this.weight = weight;
        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }
}
