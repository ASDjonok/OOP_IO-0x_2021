package ІО_06._16_Панкін_Владислав_Андрійович.lab4;

public class Plane{
	private String type; //Тип
	public int Weight; //Злітна вага
	public int AmountOfEngines; //Кількість двигунів
	public String Color; //колір
	public int PassangerSeats; //Пасажирські сидіння
	
	/*public Plane(String t, int m, int n, String c, int p){
		type=t;
		Weight=m;
		AmountOfEngines=n;
		Color=c;
		PassangerSeats=p;
	}*/

	public Plane(String type, int weight, int amountOfEngines, String color, int passangerSeats) {
		this.type = type;
		Weight = weight;
		AmountOfEngines = amountOfEngines;
		Color = color;
		PassangerSeats = passangerSeats;
	}

	public String getType() {
		return type;
	}
}