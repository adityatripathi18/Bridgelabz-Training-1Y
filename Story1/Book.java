// Base class for the Smart Library System
public class Book {

    // Instance fields
    protected int bookId;
    protected String title;
    protected double price;

    // Static variable shared across all Book instances
    public static String libraryName = "City Central Library";

    // Constructor
    public Book(int bookId, String title, double price) {
        this.bookId  = bookId;
        this.title   = title;
        this.price   = price;
    }

    // Base fine calculation: ₹1/day (default)
    public double calculateFine(int daysLate) {
        return daysLate * 1.0;
    }

    // Display basic book info
    public void displayInfo() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Price   : ₹" + price);
    }
}
