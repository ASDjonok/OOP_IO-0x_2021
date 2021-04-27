package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

import java.util.Comparator;
import java.util.Random;
import java.util.Arrays;

public class Airline {
    private String Name;
    private Plane[] park;

    public Airline(String name, int quantity) {
        this.Name=name;
        this.park = new Plane[quantity];
        Random random = new Random();
        int num;
        for (int i = 0; i < quantity; i++) {
            num = random.nextInt(6);
            park[i] = selPlane(num);
        }
    }

    public String getName() {
        return this.Name;
    }

    public int getAirlineNumber_of_places(){
        int Num = 0;
        for(int i = 0; i < park.length; i++){
            Num = Num + park[i].getNumber_of_places();
        }
        return Num;
    }

    public double getAirlineWeight_of_cargo(){
        double Weight = 0.0;
        for(int i = 0; i < park.length; i++){
            Weight = Weight + park[i].getWeight_of_cargo();
        }
        return Weight;
    }

    public void getPlaneInFuelConsumptionRange(double down, double up) {
        for(int i = 0; i < park.length; i++) {
            if(park[i].getFuel_consumption() > down & park[i].getFuel_consumption() < up) {
                System.out.println("Модель: " + park[i].getName() + ", рік випуску: " + park[i].getYear() +
                        ", число пасажирів: " + park[i].getNumber_of_places() +
                        ", маса вантажу (тонн): " + park[i].getWeight_of_cargo() +
                        ", дальність польоту: " + park[i].getRange_of_flight() +
                        ", витрати палива (тонн/годину): " + park[i].getFuel_consumption() +
                        ", максимальна висота польоту: " + park[i].getMaximum_flight_altitude() +
                        ", крейсерська швидкість: " + park[i].getCruising_speed());

            }
        }
    }

    public void sort() {
        Arrays.sort(park, new sortByRangeOfFlight());
    }

    public void display() {
        for(int i = 0; i < park.length; i++){
            System.out.println(park[i].getName() + " дальність польоту = " + park[i].getRange_of_flight());
        }
    }

    private Plane selPlane(int num) {
        Plane plane;

        Random random = new Random();
        int x = random.nextInt(30) + 1990;

        if(num == 0){
            plane = new Airbus_A310(x);
        }
        else if (num == 1) {
            plane = new Airbus_A320(x);
        }
        else if (num == 2) {
            plane = new Airbus_A330(x);
        }
        else if (num == 3) {
            plane = new Boeing_737(x);
        }
        else if (num == 4) {
            plane = new Boeing_747(x);
        }
        else{
            plane = new Boeing_777(x);
        }
        return plane;
    }
}

class sortByRangeOfFlight implements Comparator<Plane> {
    public int compare(Plane a, Plane b) {
        if(a.getRange_of_flight() < b.getRange_of_flight()) return -1;
        if(a.getRange_of_flight() == b.getRange_of_flight()) return 0;
        else return  1;
    }
}
