package BRI_lab6;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
            Визначити ієрархію електроприладів. Увімкнути деякі електроприлади в розетку.
            Підрахувати споживану потужність. Провести сортування приладів у квартирі на основі потужності.
            Знайти прилад у квартирі, що відповідає заданому діапазону електор-магнітного випромінювання.
        */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter some time in hours: ");
        double time = scanner.nextDouble();
        System.out.print("Enter a number of appliances: ");
        int numberOfAppliances = scanner.nextInt();
        System.out.println();

        // Filling a room
        ElectricalAppliance[] appliances = new ElectricalAppliance[numberOfAppliances];
        for (int i = 0; i < numberOfAppliances; i++) {
            switch (random.nextInt(5)) {
                case 1 -> appliances[i] = new Fridge("Fridge", random.nextBoolean(), random.nextInt(400 - 150) + 150, random.nextInt(500 - 100) + 100);
                case 2 -> appliances[i] = new Kettle("Kettle", random.nextBoolean(), random.nextInt(150 - 100) + 100, random.nextInt(200 - 100) + 100);
                case 3 -> appliances[i] = new PC("PC", random.nextBoolean(), random.nextInt(1000 - 500) + 500, random.nextInt(700 - 300) + 300);
                case 4 -> appliances[i] = new Toaster("Toaster", random.nextBoolean(), random.nextInt(250 - 100) + 100, random.nextInt(200 - 100) + 100);
                default -> appliances[i] = new TV("TV", random.nextBoolean(), random.nextInt(500 - 200) + 200, random.nextInt(500 - 100) + 100);
            }
        }

        // Sorting and printing new array
        Arrays.sort(appliances, new SortByPower());
        System.out.println("\\/ Sorted list of appliances by power \\/");
        for (ElectricalAppliance appliance : appliances) {
            System.out.println(appliance);
        }

        // Power consumption calculation
        int powerConsumption = 0;
        for (ElectricalAppliance appliance : appliances) {
            if (appliance.getIsPlugged()) {
                powerConsumption += time * appliance.getPower();
            }
        }
        System.out.println("\nPower consumption per " + time + " hours is " + powerConsumption + " Watt." + "\n");

        // Choosing a range of radiation and printing appliances that satisfy the condition
        System.out.println("\\/ Choose a range of electromagnetic radiation \\/");
        int min, max;
        do {
            System.out.print("Enter minimum: ");
            min = scanner.nextInt();
            System.out.print("Enter maximum: ");
            max = scanner.nextInt();
        } while (min > max);
        System.out.println("\\/ Appliances that satisfy the condition are showed below \\/");

        for (ElectricalAppliance appliance : appliances) {
            if (appliance.getElectromagneticRadiation() > min && appliance.getElectromagneticRadiation() < max) {
                System.out.println(appliance);
            }
        }
    }
}