package lab4;

/*
 * ���� � ����������� ��� ��'���� Furniture
 */
public class Furniture{
	public String type; 
	public String color; 
	public int heigh;
	public int length;
	public int width;
	
/*
 * �������� t ����'������ �� ���� type
 * �������� c ����'������ �� ���� color
 * �������� h ����'������ �� ���� heigh
 * �������� l ����'������ �� ���� length
 * �������� w ����'������ �� ���� width
 */
	
	public Furniture(String t, String c, int h, int l, int w) {
		type = t;
		color = c;
		heigh = h;
		length = l;
		width = w;
	}
}