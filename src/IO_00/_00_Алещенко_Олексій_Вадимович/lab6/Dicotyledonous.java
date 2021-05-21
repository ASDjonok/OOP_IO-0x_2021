package IO_00._00_Алещенко_Олексій_Вадимович.lab6;

public class Dicotyledonous extends Flower {
    public Dicotyledonous(int freshness, int length) {
        super(freshness, length);
    }

    @Override
    public int getCost() {
        return getLength() * 2;
    }
}
