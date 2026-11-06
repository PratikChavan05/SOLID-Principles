package solid.dip.bad;

/**
 * Low-level module: handles email sending.
 *
 * NotificationService is tightly coupled to this specific class.
 */
public class EmailSender {

    public void sendEmail(String to, String message) {
        System.out.println("Connecting to SMTP server...");
        System.out.println("Sending EMAIL to " + to + ": " + message);
        System.out.println("Email sent successfully.");
    }
}
