package lab4;

import java.util.Comparator;

/*
 * Клас використовує інтерфейс Comparator та метод compareTo
 * використовується для сортування об'єктів за довжиною
 */

public class SortLength implements Comparator<Furniture> {
	/*
	 * obj1 та obj2 - об'єкти класу Furniture
	 * два об'єкти порівнюються для подальшого сортування
	 * повертається об'єкт типу int
	 */
	public int compare(Furniture obj1, Furniture obj2) {
		return obj1.getlength() - obj2.getlength();
	}
}
