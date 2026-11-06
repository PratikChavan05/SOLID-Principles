package solid.dip.good;

/**
 * ✅ Low-level module depends on abstraction (implements MessageSender).
 */
public class EmailSender implements MessageSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("  📧 Connecting to SMTP server...");
        System.out.println("  📧 Sending EMAIL to " + recipient + ": " + message);
        System.out.println("  📧 Email sent successfully.");
    }

    @Override
    public String getChannelName() {
        return "Email";
    }
}
