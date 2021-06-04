package IO_00._00_Алещенко_Олексій_Вадимович.lab6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return freshness == flower.freshness && length == flower.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(freshness, length);
    }
}
