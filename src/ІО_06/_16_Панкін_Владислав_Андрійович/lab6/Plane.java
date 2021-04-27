package ІО_06._16_Панкін_Владислав_Андрійович.lab6;

public class Plane {

    private String name;
    private int year; //рік випуску
    private int Number_of_places; //число пасажирів
    private double Weight_of_cargo; //маса вантажу тонн
    private int Range_of_flight; //дальність польоту
    private double Fuel_consumption; //витрати палива тонн на годину
    private int Maximum_flight_altitude; //максимальна висота польоту
    private int Cruising_speed; //крейсерська швидкість


    public Plane(int year, int Number_of_places, double Weight_of_cargo, int Range_of_flight, double Fuel_consumption,
                 int Maximum_flight_altitude, int Cruising_speed){

        this.year=year;
        this.Number_of_places=Number_of_places;
        this.Weight_of_cargo=Weight_of_cargo;
        this.Range_of_flight=Range_of_flight;
        this.Fuel_consumption=Fuel_consumption;
        this.Maximum_flight_altitude=Maximum_flight_altitude;
        this.Cruising_speed=Cruising_speed;

    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int getNumber_of_places() {
        return this.Number_of_places;
    }

    public double getWeight_of_cargo() {
        return this.Weight_of_cargo;
    }

    public int getRange_of_flight() {
        return this.Range_of_flight;
    }

    public double getFuel_consumption() {
        return this.Fuel_consumption;
    }

    public int getMaximum_flight_altitude() {
        return this.Maximum_flight_altitude;
    }

    public int getCruising_speed() {
        return this.Cruising_speed;
    }

}
