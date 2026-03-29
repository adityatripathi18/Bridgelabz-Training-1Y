// Base class for the Online Food Delivery App
public class Order {

    // Static delivery charge shared across all orders
    public static double deliveryCharge = 40.0;

    protected int orderId;
    protected String itemName;
    protected double basePrice;

    public Order(int orderId, String itemName, double basePrice) {
        this.orderId   = orderId;
        this.itemName  = itemName;
        this.basePrice = basePrice;
    }

    // Default total = basePrice + deliveryCharge
    public double calculateTotal() {
        return basePrice + deliveryCharge;
    }

    public void displayOrder() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Item          : " + itemName);
        System.out.println("Base Price    : ₹" + basePrice);
        System.out.printf ("Total         : ₹%.2f%n", calculateTotal());
    }
}
