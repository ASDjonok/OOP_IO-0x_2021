package lab4;

/*
 * клас з інформацією про об'єкти Furniture
 */
public class Furniture{
	private String type; 
	private String color; 
	private int heigh;
	private int length;
	private int width;
	
/*
 * параметр t прив'язаний до поля type
 * параметр c прив'язаний до поля color
 * параметр h прив'язаний до поля heigh
 * параметр l прив'язаний до поля length
 * параметр w прив'язаний до поля width
 */
	
	public Furniture(String t, String c, int h, int l, int w) {
		this.type = t;
		this.color = c;
		this.heigh = h;
		this.length = l;
		this.width = w;
	}
	
	public String gettype() {
		return this.type;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public int getheigh() {
		return this.heigh;
	}
	
	public int getlength() {
		return this.length;
	}
	
	public int getwidth() {
		return this.width;
	}
}