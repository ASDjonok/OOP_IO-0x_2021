package Lab_6;

public class TaxiStation {
    private final Car[] CARS;

    public TaxiStation(Car[] CARS){
        this.CARS = CARS;
    }

    public double SumPrice(){
        double sum = 0;
        for (Car car : CARS) {
            sum += car.GetPrice();
        }
        return sum;
    }

    public String foundSpeed(int low, int height){
        String my_car = "";
        for (Car car : CARS) {
            if(car.GetSpeed()>low&&car.GetSpeed()<height){
                my_car = car.GetName();
                break;
            }
        }
        return my_car;
    }
}
