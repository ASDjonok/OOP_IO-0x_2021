package lab6;
/*
 * Визначити ієрархію амуніції лицаря.
 * Екіпірувати лицаря. Порахувати вартість амуніції.
 * Провести сортування амуніції за вагою.
 * Знайти елементи амуніції, що відповідає заданому діапазону цін.
 */

import java.util.Arrays;

public class lab6 {
	public static void main(String[] args) {
		Helmet Helmet1 = new Helmet("Атомно-валентный трехплоскостной осциллятор", 4065, 0.5, 4);
		Helmet Helmet2 = new Helmet("Силовой шлем T-45d", 912, 5, 5);
		Helmet Helmet3 = new Helmet("Шлем Вексилария", 131, 3.5, 1);	
		Chest Chest1 = new Chest("Стелс-броня 'Марк II'", 7392, 25, 14);
		Chest Chest2 = new Chest("Плащ Курьера", 1331, 3.5, 13);
		Chest Chest3 = new Chest("Силовая броня T-51b", 4065, 40.5, 25);
		Weapons Weapon1 = new Weapons("'Толстяк'", 10470, 15.8, 771);
		Weapons Weapon2 = new Weapons("'Ловец снов'", 18098, 5.5, 95);
		Weapons Weapon3 = new Weapons("'Слава Старого мира'", 1889, 8, 39);
		Heals Heal1 = new Heals("Стимулятор", 7650, 0.15, 120);
		Heals Heal2 = new Heals("Винт", 500, 0.2, 40);
		Heals Heal3 = new Heals("Психо", 500, 0.21, 60);
		Armor[] Array = {Helmet1, Helmet2, Helmet3, 
						Chest1, Chest2, Chest3, 
						Weapon1, Weapon2, Weapon3, 
						Heal1, Heal2, Heal3};
		Armor[] Helmets = {Helmet1, Helmet2, Helmet3};
		Armor[] Chests = {Chest1, Chest2, Chest3};
		Armor[] Guns = {Weapon1, Weapon2, Weapon3};
		Armor[] Heal = {Heal1, Heal2, Heal3};
		
		Munition Knight = new Munition(Helmets, Chests, Guns, Heal);
		
		System.out.println();
		Armor[] Array1 = Knight.GetEquip();
		System.out.println("Амуніція лицаря:");
		for(int i=0; i<4; i++) {
			System.out.println(Array1[i].GetName());
		}
		
		System.out.println();
		System.out.println("Вартість амуніції:");
		Costs Sum = new Costs(Array1);
		System.out.println(Sum.GetSum());
		System.out.println();
		
		Range Money = new Range(Array);
		Armor[] Equip = Money.GetAmunition();
		for(int i=0; i<Equip.length; i++) {
			System.out.println("Назва:"+Equip[i].GetName()+" Ціна: "+Equip[i].GetPrice());
		}
		
		
		System.out.println();
		System.out.println("Відсортовано за вагою:");
		Arrays.sort(Array, new SortWeight().reversed());
		for(int i=0; i<Array.length; i++) {
			System.out.println("Назва:"+Array[i].GetName() +", вага: " + Array[i].GetWeight());
		}
		Knight.Close();
	}
}
