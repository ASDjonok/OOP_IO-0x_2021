package lab6;

import java.util.Objects;

public class Sweets {
    private int kgQuantity;
    private int chocolatePercentage;
    private int totalPrice;

    public Sweets(int kgQuantity, int chocolatePercentage) {
        this.kgQuantity = kgQuantity;
        this.chocolatePercentage = chocolatePercentage;
    }

    public int getChocolatePercentage() {
        return chocolatePercentage;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getKgQuantity() {
        return kgQuantity;
    }

    public void setTotalPrice(int kgPrice, int kgQuantity) {
        this.totalPrice = kgPrice * kgQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return kgQuantity == sweets.kgQuantity && chocolatePercentage == sweets.chocolatePercentage && totalPrice == sweets.totalPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kgQuantity, chocolatePercentage, totalPrice);
    }
}
