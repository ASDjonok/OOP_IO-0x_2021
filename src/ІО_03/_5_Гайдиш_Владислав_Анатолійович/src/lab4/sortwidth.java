package lab4;

import java.util.Comparator;

/*
 * ���� ����������� ��������� Comparator �� ����� compareTo
 * ��������������� ��� ���������� ��'���� �� �������
 */

public class sortwidth implements Comparator<Furniture> {
	/*
	 * obj1 �� obj2 - ��'���� ����� Furniture
	 * ��� ��'���� ����������� ��� ���������� ����������
	 * ����������� ��'��� ���� int
	 */
	public int compare(Furniture obj1, Furniture obj2) {
		return obj1.width - obj2.width;
	}
}