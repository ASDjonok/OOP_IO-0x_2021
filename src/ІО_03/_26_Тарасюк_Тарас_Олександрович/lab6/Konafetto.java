package lab6;

public class Konafetto extends Sweets{
    private final int kgPrice = 20;

    public Konafetto(int kgQuantity, int chocolatePercentage) {
        super(kgQuantity, chocolatePercentage);
        super.setTotalPrice(this.kgPrice,kgQuantity);
    }

    @Override
    public String toString() {
        return "Konafetto{" +
                "kgPrice=" + kgPrice +
                ", totalPrice=" + super.getTotalPrice() +
                ", chocolatePercentage=" + super.getChocolatePercentage() +
                ", kgQuantity=" + super.getKgQuantity() +
                '}';
    }
}
