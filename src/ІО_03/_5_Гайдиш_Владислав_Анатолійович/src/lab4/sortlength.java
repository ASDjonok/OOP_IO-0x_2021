package lab4;

import java.util.Comparator;

/*
 * ���� ����������� ��������� Comparator �� ����� compareTo
 * ��������������� ��� ���������� ��'���� �� ��������
 */

public class sortlength implements Comparator<Furniture> {
	/*
	 * obj1 �� obj2 - ��'���� ����� Furniture
	 * ��� ��'���� ����������� ��� ���������� ����������
	 * ����������� ��'��� ���� int
	 */
	public int compare(Furniture obj1, Furniture obj2) {
		return obj2.length - obj1.length;
	}
}
