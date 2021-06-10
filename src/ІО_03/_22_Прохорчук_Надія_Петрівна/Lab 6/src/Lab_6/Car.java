package Lab_6;

public class Car {
    private final String NAME;
    private final int PETROL;
    private final int SPEED;
    private final double PRICE;

    public Car(String NAME, int PETROL, int SPEED, double PRICE){
        this.NAME = NAME;
        this.PETROL = PETROL;
        this.SPEED = SPEED;
        this.PRICE = PRICE;
    }

    public String GetName(){
        return NAME;
    }

    public int GetPetrol(){
        return PETROL;
    }

    public int GetSpeed(){
        return SPEED;
    }

    public double GetPrice(){
        return PRICE;
    }
}
