package solid.srp.good;

/**
 * ✅ Separate class for persistence responsibility.
 *
 * If we ever switch from database to file storage or cloud storage,
 * ONLY this class changes — Invoice and InvoiceNotifier are untouched.
 */
public class InvoicePersistence {

    public void saveToDatabase(Invoice invoice) {
        System.out.println("Connecting to database...");
        System.out.println("INSERT INTO invoices (customer, amount, total) VALUES ('"
                + invoice.getCustomer() + "', " + invoice.getAmount() + ", " + invoice.calculateTotal() + ")");
        System.out.println("Invoice saved to database.");
    }

    public void saveToFile(Invoice invoice) {
        System.out.println("Writing to file: invoice_" + invoice.getCustomer() + ".txt");
        System.out.println("Content: " + invoice.getCustomer() + " | $" + invoice.calculateTotal());
        System.out.println("Invoice saved to file.");
    }
}
