package IO_00._00_Алещенко_Олексій_Вадимович.lab4;

//todo add generic
public /*abstract*/ class Car /*extends Object*/ implements Comparable<Car> {
    private String color;
    private int paintLayerThickness;
    private BodyType bodyType;

    public Car(String color, int paintLayerThickness, BodyType bodyType) {
        this.color = color;
        this.paintLayerThickness = paintLayerThickness;
        this.bodyType = bodyType;
    }

    public Car() {
        this.color = "Black";
        this.paintLayerThickness = 1;
        this.bodyType = BodyType.UNIVERSAL;
    }

//    public abstract void myAbstractMethod();

    public void setColor(String color) {
        this.color = color;
        paintLayerThickness++;
    }

    public String getColor() {
        return color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getPaintLayerThickness() {
        return paintLayerThickness;
    }

    //todo add generic
    /*@Override
    public int compareTo(Object o) {
        return *//*this.*//*getColor().compareTo(((Car)o).getColor());
    }*/
    @Override
    public int compareTo(Car car) {
//        return /*this.*/getColor().compareTo(car.getColor());
//        return -/*this.*/getColor().compareTo(car.getColor());
        return car.getColor().compareTo(/*this.*/getColor());
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", paintLayerThickness=" + paintLayerThickness +
                ", bodyType=" + bodyType +
                '}';
    }

    /*public void setPaintLayerThickness(int paintLayerThickness) {
        this.paintLayerThickness = paintLayerThickness;
    }*/
}
