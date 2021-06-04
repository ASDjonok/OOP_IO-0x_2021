package lab6;

import java.util.Scanner;

public class Munition{
	private Armor[] Amunition;
	private Scanner Number = new Scanner(System.in);
	
	public Munition(Armor[] Helmets, Armor[] Chests, Armor[] Guns, Armor[] Heals) {
		//Scanner Number = new Scanner(System.in);
		
		for(int i=0; i<Helmets.length; i++) {
			System.out.println(i+1+" "+ Helmets[i].GetName());
		}
		System.out.println();
		for(int i=0; i<Chests.length; i++) {
			System.out.println(i+1+" "+ Chests[i].GetName());
		}
		System.out.println();
		for(int i=0; i<Guns.length; i++) {
			System.out.println(i+1+" "+ Guns[i].GetName());
		}
		System.out.println();
		for(int i=0; i<Heals.length; i++) {
			System.out.println(i+1+" "+ Heals[i].GetName());
		}
		System.out.println();
		System.out.println("Виберіть елементи екіпіровки(введіть число):");
		System.out.println("Шолом:");
		int Helmet = Number.nextInt();
		System.out.println("Обладунок:");
		int Chest = Number.nextInt();
		System.out.println("Наголінник:");
		int Gun = Number.nextInt();
		System.out.println("Взуття:");
		int Heal = Number.nextInt();
		//Number.close();
		
		
		Armor[] Amu = {Helmets[Helmet-1], Chests[Chest-1], Guns[Gun-1], Heals[Heal-1]};
		this.Amunition = Amu;
	}
	
	public Armor[] GetEquip() {
		return this.Amunition;
	}
	public void Close() {
		Number.close();
	}
}
