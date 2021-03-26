package lab4;

/*
 * клас з інформацією про об'єкти Furniture
 */
public class Furniture{
	public String type; 
	public String color; 
	public int heigh;
	public int length;
	public int width;
	
/*
 * параметр t прив'язаний до поля type
 * параметр c прив'язаний до поля color
 * параметр h прив'язаний до поля heigh
 * параметр l прив'язаний до поля length
 * параметр w прив'язаний до поля width
 */
	
	public Furniture(String t, String c, int h, int l, int w) {
		type = t;
		color = c;
		heigh = h;
		length = l;
		width = w;
	}
}