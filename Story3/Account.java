// Base class for the Bank Interest Calculator
public class Account {

    // Static variable shared across all accounts
    public static String bankName = "National Savings Bank";

    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName    = holderName;
        this.balance       = balance;
    }

    // Default interest calculation (overridden in child classes)
    public double calculateInterest() {
        return 0.0;
    }

    public void displayAccount() {
        System.out.println("Account No  : " + accountNumber);
        System.out.println("Holder      : " + holderName);
        System.out.printf ("Balance     : ₹%.2f%n", balance);
        System.out.printf ("Interest    : ₹%.2f%n", calculateInterest());
    }
}
