package lab6;

public class CandyNut extends Sweets{
    private final int kgPrice = 20;

    public CandyNut(int kgQuantity, int chocolatePercentage) {
        super(kgQuantity, chocolatePercentage);
        super.setTotalPrice(this.kgPrice,kgQuantity);
    }

    @Override
    public String toString() {
        return "CandyNut{" +
                "kgPrice=" + kgPrice +
                ", totalPrice=" + super.getTotalPrice() +
                ", chocolatePercentage=" + super.getChocolatePercentage() +
                ", kgQuantity=" + super.getKgQuantity() +
                '}';
    }
}
