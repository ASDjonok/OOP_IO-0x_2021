package lab6;

public class Armor{
	private String Name;
	private int Price;
	private double Weight;
	private int Characteristics;
	
	public Armor(String N, int P, double W, int C) {
		this.Name = N;
		this.Price = P;
		this.Weight = W;
		this.Characteristics = C;
	}
	
	public String GetName() {
		return this.Name;
	}
	
	public int GetPrice() {
		return this.Price;
	}
	
	public double GetWeight() {
		return this.Weight;
	}
	
	public int GetChars() {
		return this.Characteristics;
	}
}
