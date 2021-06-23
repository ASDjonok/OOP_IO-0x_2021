package lab6;

public class Toffelini extends Sweets {
    private final int kgPrice = 20;

    public Toffelini(int kgQuantity, int chocolatePercentage) {
        super(kgQuantity, chocolatePercentage);
        super.setTotalPrice(this.kgPrice,kgQuantity);
    }

    @Override
    public String toString() {
        return "Toffelini{" +
                "kgPrice=" + kgPrice +
                ", totalPrice=" + super.getTotalPrice() +
                ", chocolatePercentage=" + super.getChocolatePercentage() +
                ", kgQuantity=" + super.getKgQuantity() +
                '}';
    }
}
