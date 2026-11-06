package solid.dip.good;

/**
 * ✅ Yet another low-level module — again, ZERO changes to NotificationService.
 */
public class PushNotificationSender implements MessageSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("  🔔 Connecting to push notification service...");
        System.out.println("  🔔 Sending PUSH to " + recipient + ": " + message);
        System.out.println("  🔔 Push notification sent successfully.");
    }

    @Override
    public String getChannelName() {
        return "Push Notification";
    }
}
