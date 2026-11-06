package solid.srp.good;

/**
 * ✅ Separate class for notification responsibility.
 *
 * If we ever switch from email to SMS or push notifications,
 * ONLY this class changes — Invoice and InvoicePersistence are untouched.
 */
public class InvoiceNotifier {

    public void sendEmail(Invoice invoice) {
        System.out.println("Connecting to SMTP server...");
        System.out.println("Sending email to " + invoice.getCustomer()
                + ": Your invoice total is $" + invoice.calculateTotal());
        System.out.println("Email sent successfully.");
    }

    public void sendSMS(Invoice invoice) {
        System.out.println("Connecting to SMS gateway...");
        System.out.println("SMS to " + invoice.getCustomer()
                + ": Invoice total $" + invoice.calculateTotal());
        System.out.println("SMS sent.");
    }
}
