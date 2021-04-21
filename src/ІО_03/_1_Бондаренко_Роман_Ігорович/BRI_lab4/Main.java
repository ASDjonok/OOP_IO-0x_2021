package BRI_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void output(Object[] array) {
        for (Object element : array) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // C11 = 301 % 11 = 4 -> Визначити клас морський човен, який складається як мінімум з 5-и полів.

        Scanner scanner = new Scanner(System.in);

        Boat[] shipsArray = new Boat[5];
        shipsArray[0] = new Boat("Eliza", "Ukraine", "Yacht", 1, 15, 100000);
        shipsArray[1] = new Boat("Marine", "USA", "Yacht", 2, 80, 85000);
        shipsArray[2] = new Boat("Kira", "Panama", "Barge", 5, 3000, 1000000);
        shipsArray[3] = new Boat("Ruby", "Italy", "Cruise", 3, 2500, 1200000);
        shipsArray[4] = new Boat("Astra", "France", "Barge", 7, 7000, 900000);

        System.out.println("Default output:");
        output(shipsArray);

        while (true) {
            System.out.print("""
                Choose a feature to sort by:
                1. Name
                2. Place of manufacturing
                3. Type
                4. Age
                5. Tonnage
                6. Price
                7. To close the program type "stop"
                """);
            System.out.print("Type a feature: ");
            String feature = scanner.nextLine();
            System.out.println();

            if (feature.equalsIgnoreCase("stop")) {
                System.out.print("Closing a program...");
                break;
            }

            System.out.print("""
                Sort by:
                1. Ascending
                2. Descending
                3. To close the program type "stop"
                """);
            System.out.print("Select an option: ");
            String option = scanner.nextLine();
            System.out.println();

            if (option.equalsIgnoreCase("stop")) {
                System.out.print("Closing a program...");
                break;
            }

            switch (feature.toLowerCase()) {
                case "name" -> {
                    System.out.println("Name was selected.");
                    if (option.equalsIgnoreCase("ascending") || option.equals("1")) {
                        Arrays.sort(shipsArray, new SortByName());
                    } else if (option.equalsIgnoreCase("descending") || option.equals("2")) {
                        Arrays.sort(shipsArray, new SortByName().reversed());
                    }
                    output(shipsArray);
                }
                case "place of manufacturing" -> {
                    System.out.println("Place of manufacturing was selected.");
                    if (option.equalsIgnoreCase("ascending") || option.equals("1")) {
                        Arrays.sort(shipsArray, new SortByPlaceOfManufactured());
                    } else if (option.equalsIgnoreCase("descending") || option.equals("2")) {
                        Arrays.sort(shipsArray, new SortByPlaceOfManufactured().reversed());
                    }
                    output(shipsArray);
                }
                case "type" -> {
                    System.out.println("Type was selected.");
                    if (option.equalsIgnoreCase("ascending") || option.equals("1")) {
                        Arrays.sort(shipsArray, new SortByType());
                    } else if (option.equalsIgnoreCase("descending") || option.equals("2")) {
                        Arrays.sort(shipsArray, new SortByType().reversed());
                    }
                    output(shipsArray);
                }
                case "age" -> {
                    System.out.println("Age was selected.");
                    if (option.equalsIgnoreCase("ascending") || option.equals("1")) {
                        Arrays.sort(shipsArray, new SortByAge());
                    } else if (option.equalsIgnoreCase("descending") || option.equals("2")) {
                        Arrays.sort(shipsArray, new SortByAge().reversed());
                    }
                    output(shipsArray);
                }
                case "tonnage" -> {
                    System.out.println("Tonnage was selected.");
                    if (option.equalsIgnoreCase("ascending") || option.equals("1")) {
                        Arrays.sort(shipsArray, new SortByTonnage());
                    } else if (option.equalsIgnoreCase("descending") || option.equals("2")) {
                        Arrays.sort(shipsArray, new SortByTonnage().reversed());
                    }
                    output(shipsArray);
                }
                case "price" -> {
                    System.out.println("Price was selected.");
                    if (option.equalsIgnoreCase("ascending") || option.equals("1")) {
                        Arrays.sort(shipsArray, new SortByPrice());
                    } else if (option.equalsIgnoreCase("descending") || option.equals("2")) {
                        Arrays.sort(shipsArray, new SortByPrice().reversed());
                    }
                    output(shipsArray);
                }
                default -> System.out.println("Wrong feature was selected.\n");
            }
        }
    }
}
