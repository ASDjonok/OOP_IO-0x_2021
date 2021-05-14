package ІО_06._16_Панкін_Владислав_Андрійович.lab7;

public class Main {

    public static void main(String[] args) {
        /*
          C2 = 1  Set
          C3 = 1  Однозв’язний список
        */

        int NZK = 619;
        int C2 = NZK % 2;
        int C3 = NZK % 3;
        System.out.println("C2 = " + C2);
        System.out.println("C3 = " + C3);

        PlaneCollection/*<Plane>*/ Airline = new PlaneCollection/*<Plane>*/();
        Plane p1 = new Plane("Airbus A310", 1997, 187, 0, 4600, 4.4, 12200, 850);
        Plane p2 = new Plane("Airbus A320", 1999, 259, 0, 6100, 2.5, 10668, 853);
        Plane p3 = new Plane("Airbus A330", 2010, 440, 0, 11900, 6.4, 12500, 925);
        Plane p4 = new Plane("Boeing 737", 2002, 114, 2.4, 2518, 2.5, 10058, 793);
        Plane p5 = new Plane("Boeing 747", 2015, 425, 20, 9850, 10.2, 10668, 917);
        Plane p6 = new Plane("Boeing 777", 2021, 235, 20, 7406, 7, 10668, 891);

        /*Заповнення колекції літаків*/
        Airline.add(p1);
        Airline.add(p2);
        Airline.add(p3);
        Airline.add(p1);

        Airline.remove(p2);

        PlaneCollection/*<Plane>*/ Airline1 = new PlaneCollection/*<Plane>*/();
        Airline1.add(p4);
        Airline1.add(p5);
        Airline1.add(p6);
        Airline.addAll(Airline1);

        /*Додавання колекції до масиву */
        Object[] mas = Airline.toArray();
        for (Object object : mas) {
            Plane s = (Plane)object;
            System.out.println(s.getName());
        }
    }
}
