package com.fastroof.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Lab6Main {
    public static void main(String[] args) {
        /*
        0219
        C13 = 11 ->
        Завантажити фургон певного обсягу вантажем на певну суму з різних сортів кави, що можуть перебувати у різних
        фізичних станах (зерно, мелена, розчинна в банках і пакетиках). Ураховувати обсяг кава разом з упаковкою.
        Провести сортування товарів на основі співвідношення ціни й ваги. Знайти товар у фургоні, що відповідає
        заданому діапазону якості кави.
        */

        // Два вида контейнерів. У коробках транспортуються всі види кави, а в пакетиках тільки розчинна
        Case box = new Case("box", 5, 0.1, 0.0005); // 5 грн, 100 г, 500 мл
        Case stick = new Case("stick", 4, 0.01, 0.00002); // 4 грн, 10 г, 20 мл
        Case[] cases = {box, stick};

        // Перелік назв
        String[] firms = {"Arabica", "Canephora", "Liberica", "Premium", "Original", "Espresso", "Gold", "Classic",
                "Columbia"};

        Coffee[] coffees = new Coffee[firms.length];

        // Діапазон густини кави в кг/м^3
        int minDensity = 550;
        int maxDensity = 650;

        // Рандомно завантажую фургон замовленої кави
        for (int i = 0; i < firms.length; i++) {
            Random random = new Random();
            String name = firms[i];
            int quantity = 1 + random.nextInt(10); // from 1 to 10
            double price = 600 * random.nextDouble();
            double density = minDensity + (maxDensity - minDensity) * random.nextDouble();

            switch (random.nextInt(3)) {
                case 0:
                    coffees[i] = new InstantCoffee(name, quantity, price, density, cases[random.nextInt(2)]);
                    break;
                case 1:
                    coffees[i] = new BeanCoffee(name, quantity, price, density, random.nextInt(20));
                    break;
                default:
                    coffees[i] = new GrindCoffee(name, quantity, price, density, random.nextBoolean());
            }
        }

        for (Coffee coffee : coffees) {
            System.out.println("type=" + coffee.getClass().getSimpleName() + ", " + coffee.toString());
        }

        ArrayList<Coffee> coffeesArrayList = new ArrayList<>(Arrays.asList(coffees));

        System.out.println("\nКава відсортована за ціною за кілогра (зростання):");
        coffeesArrayList.sort(Comparator.comparingDouble(Coffee::getPrice));

        for (Coffee coffee : coffeesArrayList) {
            System.out.println("type=" + coffee.getClass().getSimpleName() + ", " + coffee.toString());
        }

        // Задаємо діапазон потрібної якості
        int minQuality = 3;
        int maxQuality = 7;

        System.out.println("\nКава, що входить у діапазон потрібної якості (від " + minQuality + " до " + maxQuality + "):");

        for (Coffee coffee: coffeesArrayList) {
            if ((3 <= coffee.getQuality()) && (coffee.getQuality() <= 7)) {
                System.out.println("type=" + coffee.getClass().getSimpleName() + ", " + coffee.toString());
            }
        }


    }
}
