// ElectronicProduct extends Product — also searches by brand
public class ElectronicProduct extends Product {

    private String brand;
    private String category;  // e.g. "Laptop", "Mobile"

    public ElectronicProduct(int productId, String productName,
                              double price, String brand, String category) {
        super(productId, productName, price);
        this.brand    = brand;
        this.category = category;
    }

    // Override: match by product name OR brand OR category
    @Override
    public boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase())
            || brand.equalsIgnoreCase(keyword)
            || category.equalsIgnoreCase(keyword);
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Brand        : " + brand);
        System.out.println("Category     : " + category);
    }

    // Simple main to demonstrate product search
    public static void main(String[] args) {

        System.out.println("=== E-Commerce Product Search ===\n");

        Product[] products = {
            new Product(401, "Wooden Bookshelf", 3500.00),
            new ElectronicProduct(402, "Galaxy S24 Ultra", 89999.00, "Samsung", "Mobile"),
            new ElectronicProduct(403, "MacBook Air M2", 115000.00, "Apple", "Laptop")
        };

        String keyword = "laptop";
        System.out.println("Search keyword: \"" + keyword + "\"\n");

        for (Product p : products) {
            if (p.isMatch(keyword)) {
                System.out.println("--- Match Found ---");
                p.displayProduct();
            }
        }

        System.out.println("\nSearch keyword: \"samsung\"\n");
        for (Product p : products) {
            if (p.isMatch("samsung")) {
                System.out.println("--- Match Found ---");
                p.displayProduct();
            }
        }
    }
}
