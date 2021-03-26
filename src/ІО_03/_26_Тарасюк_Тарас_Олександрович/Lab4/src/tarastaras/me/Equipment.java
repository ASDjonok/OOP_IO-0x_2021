package tarastaras.me;

public class Equipment{
	// поля класу
    String kindOfSport;
    String typeOfGoods;
    String name;
    String color;
    int price;
    int year;
    boolean discount;

    // конструктор
    public Equipment(String kindOfSport, String typeOfGoods, String name, String color, int price, int year, boolean discount) {
        this.kindOfSport = kindOfSport;
        this.typeOfGoods = typeOfGoods;
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
        this.discount = discount;
    }
    
    // методи
//    @Override
//    public String toString() {
//        return "Equipment{" +
//                "kindOfSport='" + kindOfSport + '\'' +
//                ", typeOfGoods='" + typeOfGoods + '\'' +
//                ", name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", year=" + year +
//                ", discount=" + discount +
//                '}';
//    }



}
