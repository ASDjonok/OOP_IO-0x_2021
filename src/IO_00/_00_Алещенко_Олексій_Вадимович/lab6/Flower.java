package IO_00._00_Алещенко_Олексій_Вадимович.lab6;

abstract public class Flower {
    private int freshness;
    private int length;

    public Flower(int freshness, int length) {
        this.freshness = freshness;
        this.length = length;
    }

    abstract public int getCost();

    public int getLength() {
        return length;
    }
}
