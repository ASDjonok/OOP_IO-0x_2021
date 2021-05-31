package lab6;

public class Costs {
	public int Sum;
	public Costs(Armor[] Array1) {
		this.Sum = 0;
		for(int i=0; i<4; i++) {
			this.Sum += Array1[i].GetPrice();
		}
	}
	
	public int GetSum() {
		return this.Sum;
	}
}
