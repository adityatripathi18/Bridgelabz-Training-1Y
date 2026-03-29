// Base class for E-Commerce Product Search
public class Product {

    protected int productId;
    protected String productName;
    protected double price;

    public Product(int productId, String productName, double price) {
        this.productId   = productId;
        this.productName = productName;
        this.price       = price;
    }

    // Returns true if keyword matches the product name (case-insensitive)
    public boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }

    public void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.printf ("Price        : ₹%.2f%n", price);
    }
}
