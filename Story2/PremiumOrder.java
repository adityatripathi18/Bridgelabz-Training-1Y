// PremiumOrder — applies 20% discount on basePrice + delivery
public class PremiumOrder extends Order {

    private static final double DISCOUNT_RATE = 0.20;

    public PremiumOrder(int orderId, String itemName, double basePrice) {
        super(orderId, itemName, basePrice);
    }

    // Override: apply 20% discount on the total
    @Override
    public double calculateTotal() {
        double total    = basePrice + deliveryCharge;
        double discount = total * DISCOUNT_RATE;
        return total - discount;
    }

    @Override
    public void displayOrder() {
        System.out.println("Order Type    : Premium Order (20% Discount Applied)");
        super.displayOrder();
    }
}
