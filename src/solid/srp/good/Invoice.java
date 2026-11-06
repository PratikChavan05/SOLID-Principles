package solid.srp.good;

/**
 * ✅ FOLLOWS Single Responsibility Principle
 *
 * Invoice class has ONE reason to change: business/calculation logic.
 * Persistence and notification are handled by separate classes.
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

    /**
     * The ONLY responsibility: calculate the invoice total.
     */
    public double calculateTotal() {
        return amount + (amount * taxRate);
    }

    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }
    public double getTaxRate() { return taxRate; }
}
