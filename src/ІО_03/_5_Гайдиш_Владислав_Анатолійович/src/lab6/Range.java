package lab6;

import java.util.Scanner;

public class Range {
	private Armor[] InRange;
	
	public Range(Armor[] Array) {
		Scanner Number = new Scanner(System.in);
		System.out.println("Введіть діапазон:");
		int lower = Number.nextInt();
		int upper = Number.nextInt();
		while(upper < lower) {
			System.out.println("Введіть коректний верхній діапазон");
			upper = Number.nextInt();
		}
		//System.out.println("Діапазон: "+lower+"-"+upper);
		Number.close();
		
		Armor[] Range = new Armor[Array.length];
		System.out.println();
		
		int j=0;
		for(int i=0; i<Array.length; i++) {
			if(Array[i].GetPrice()>lower && Array[i].GetPrice()<upper) {
				Range[j] = Array[i];
				j+=1;
			}
		}
		
		Armor[] NewRange = new Armor[j];
		
		for(int i=0; i<j; i++) {
			NewRange[i] = Range[i];
		}
		
		this.InRange = NewRange;	
		System.out.println("Амуніція, що відповідає діапазону "+lower+"-"+upper+":");
	}
	
	public Armor[] GetAmunition() {
		return this.InRange;
	}
}
