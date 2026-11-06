package solid.dip.good;

/**
 * ✅ Another low-level module — added WITHOUT changing NotificationService.
 */
public class SMSSender implements MessageSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("  📱 Connecting to SMS gateway...");
        System.out.println("  📱 Sending SMS to " + recipient + ": " + message);
        System.out.println("  📱 SMS sent successfully.");
    }

    @Override
    public String getChannelName() {
        return "SMS";
    }
}
