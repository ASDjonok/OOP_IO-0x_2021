package Lab4;

import java.util.Arrays;


public class SportManager {
    public static void main(String[] args) {
        //створюємо масив об'єктів
        Equipment [] goodsArray = new Equipment[6];
        goodsArray[0] = new Equipment("Basketball", "ball", "Wilson 3x3 ", "yellow", -500, 2018, false);
        goodsArray[1] = new Equipment("Box","gloves","BadBoy 77", "black", 770, 2020, true);
        goodsArray[2] = new Equipment("Football", "ball","Adidas X EG7125", "orange", 770, 2021, true);
        goodsArray[3] = new Equipment("Tenis","racket", "Dunlop 46", "red", 300, 2019, false);
        goodsArray[4] = new Equipment("MMA","cap","Venum Original", "transparent", 20, 2021, false);
        goodsArray[5] = new Equipment("Hockey","stick","Warrior Covert", "red", 1000, 2019, true);

        //сортуємо ціни за спаданням (використовуємо метод reversed())
        Arrays.sort(goodsArray,new SortByPrice().reversed());
        System.out.println("Sort by price, descending:");
        for (Equipment element: goodsArray){
            System.out.println(element);
        }

        // сортуємо імена за зростанням(алфавіт)
        Arrays.sort(goodsArray, new SortByName());
        System.out.println("Sort by name, ascending:");
        for (Equipment element: goodsArray){
            System.out.println(element);
        }

    }
}
