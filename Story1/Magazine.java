// Magazine extends Book — overrides fine to ₹5/day
public class Magazine extends Book {

    private String issueMonth;

    public Magazine(int bookId, String title, double price, String issueMonth) {
        super(bookId, title, price);
        this.issueMonth = issueMonth;
    }

    // Override: Magazine fine = ₹5 per day
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 5.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue   : " + issueMonth);
        System.out.println("Type    : Magazine");
    }
}
