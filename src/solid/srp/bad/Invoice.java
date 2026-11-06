package solid.srp.bad;

/**
 * ❌ VIOLATES Single Responsibility Principle
 *
 * This Invoice class has THREE reasons to change:
 *   1. If the invoice calculation logic changes (e.g., tax rules)
 *   2. If the persistence mechanism changes (e.g., switch from DB to file)
 *   3. If the notification method changes (e.g., switch from email to SMS)
 *
 * Each of these responsibilities should be in its own class.
 */
public class Invoice {

    private String customer;
    private double amount;
    private double taxRate;

    public Invoice(String customer, double amount, double taxRate) {
        this.customer = customer;
        this.amount = amount;
        this.taxRate = taxRate;
    }

    // ─── Responsibility 1: Business/Calculation Logic ───
    public double calculateTotal() {
        return amount + (amount * taxRate);
    }

    // ─── Responsibility 2: Persistence ───
    public void saveToDatabase() {
        // Imagine real DB code here
        System.out.println("Connecting to database...");
        System.out.println("INSERT INTO invoices (customer, amount, total) VALUES ('"
                + customer + "', " + amount + ", " + calculateTotal() + ")");
        System.out.println("Invoice saved to database.");
    }

    // ─── Responsibility 3: Notification ───
    public void sendEmailNotification() {
        // Imagine real email sending code here
        System.out.println("Connecting to SMTP server...");
        System.out.println("Sending email to " + customer + ": Your invoice total is $" + calculateTotal());
        System.out.println("Email sent successfully.");
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getters
    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }
    public double getTaxRate() { return taxRate; }
}
