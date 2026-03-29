// Main class — demonstrates polymorphism in the Food Delivery App
public class TestOrder {

    public static void main(String[] args) {

        System.out.println("=== Online Food Delivery App ===\n");
        System.out.println("Standard Delivery Charge : ₹" + Order.deliveryCharge + "\n");

        // Polymorphic array
        Order[] orders = {
            new RegularOrder(1001, "Paneer Butter Masala", 250.00),
            new PremiumOrder(1002, "Chicken Biryani", 350.00)
        };

        for (Order o : orders) {
            System.out.println("-----------------------------");
            o.displayOrder();   // polymorphic dispatch
        }

        System.out.println("-----------------------------");
    }
}
