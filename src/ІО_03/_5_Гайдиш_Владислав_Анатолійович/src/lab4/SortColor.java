package lab4;

import java.util.Comparator;

/*
 * ���� ����������� ��������� Comparator �� ����� compareTo
 * ��������������� ��� ���������� ��'���� �� ��������
 */

public class SortColor implements Comparator<Furniture> {
	/*
	 * obj1 �� obj2 - ��'���� ����� Furniture
	 * ��� ��'���� ����������� ��� ���������� ����������
	 * ����������� ��'��� ���� int
	 */
	public int compare(Furniture obj1, Furniture obj2) {
		return obj1.getcolor().compareTo(obj2.getcolor());
	}
}
