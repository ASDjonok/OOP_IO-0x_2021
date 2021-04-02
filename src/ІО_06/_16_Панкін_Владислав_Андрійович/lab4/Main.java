package ІО_06._16_Панкін_Владислав_Андрійович.lab4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
          C11 = 3 Визначити клас літак, який складається як мінімум з 5-и полів.
        */

        int NZK = 619;
        int C11 = NZK % 11;
        System.out.println("C11 = " + C11);

		Plane plane1 = new Plane ("Військовий", 35, 4, "зелений", 2);
		Plane Plane2 = new Plane ("Пасажирський", 20, 6, "синьожовтий", 125);
		Plane Plane3 = new Plane ("Поштовий", 60, 2, "жовтий", 2);
		Plane Plane4 = new Plane ("Військовий", 25, 3, "зелений", 6);
		Plane Plane5 = new Plane ("Пасажирський", 45, 4, "фіолетовий", 225);
		Plane array[] = {plane1, Plane2, Plane3, Plane4, Plane5};

		Arrays.sort(array, new ByType());
		System.out.println("Сортування літаків за типом у алфавітному порядку (у порядку зростання):");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getType());
		}
		System.out.println("Сортування літаків за кількістю двигунів у спадаючому порядку:");
		Arrays.sort(array, new ByAmount());
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].AmountOfEngines);
		}

    }
}
