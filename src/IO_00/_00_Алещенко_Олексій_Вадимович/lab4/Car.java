package IO_00._00_Алещенко_Олексій_Вадимович.lab4;

public class Car {
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

    /*public void setPaintLayerThickness(int paintLayerThickness) {
        this.paintLayerThickness = paintLayerThickness;
    }*/
}
