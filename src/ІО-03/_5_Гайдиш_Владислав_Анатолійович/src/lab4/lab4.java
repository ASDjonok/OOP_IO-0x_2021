package lab4;

import java.util.Arrays;
/*
 * 305%11=8
 * Визначити клас меблі, який складається як мінімум з 5-и полів.
 */

/*
 * Виконавчий клас, в якому заданий маисв об'єктів класу Furniture
 * Клас сортує масив за одним з полів за спаданням або зростанням
 * 
 * Пакет: 	lab4.Furniture
 * 			lab4.sortlength
 * 			lab4.sortwidth
 * 			lab4.sortheigh
 * 			lab4.sortcolor
 * 			lab4.sorType
 *
*/

public class lab4 {
	public static void main(String[] args) {
		Furniture table1 = new Furniture("table", "brown", 74, 150, 75);
		Furniture table2 = new Furniture("table", "darkoak", 76, 140, 80);
		Furniture table3 = new Furniture("table", "white", 75, 180, 80);
		Furniture chair1 = new Furniture("chair", "lightbirch", 84, 56, 74);
		Furniture chair2 = new Furniture("chair", "red", 120, 42, 55);
		Furniture chair3 = new Furniture("chair", "black", 95, 46, 52);
		Furniture[] Array = { table1, table2, table3, chair1, chair2, chair3 };

		Arrays.sort(Array, new sortlength());
		System.out.print("Сортування за довжиною:");// за спаданням
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i].length + " ");
		}

		System.out.println();
		Arrays.sort(Array, new sortwidth());
		System.out.print("Сортування за шириною:");// за зростанням
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i].width + " ");
		}

		System.out.println();
		Arrays.sort(Array, new sortheigh());
		System.out.print("Сортування за висотою:");// за зростанням
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i].heigh + " ");
		}

		System.out.println();
		Arrays.sort(Array, new sortcolor());
		System.out.print("Сортування за кольором:");// за сростанням
		for (int i = 0; i < Array.length; i++) {
			System.out.print(" " + Array[i].color);
		}

		System.out.println();
		Arrays.sort(Array, new sorType());
		System.out.print("Сортування за типом:");// за спаданням
		for (int i = 0; i < Array.length; i++) {
			System.out.print(" " + Array[i].type);
		}

	}
}
