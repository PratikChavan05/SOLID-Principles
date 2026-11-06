package solid.dip.good;

/**
 * ✅ FOLLOWS Dependency Inversion Principle
 *
 * The ABSTRACTION that both high-level and low-level modules depend on.
 *
 * The dependency arrows now point INWARD toward this interface:
 *   NotificationService → MessageSender ← EmailSender
 *   NotificationService → MessageSender ← SMSSender
 *   NotificationService → MessageSender ← PushNotificationSender
 *
 * Both high-level and low-level modules depend on the abstraction.
 */
public interface MessageSender {

    /**
     * Send a message to a recipient.
     *
     * @param recipient The user/address to send to
     * @param message   The message content
     */
    void send(String recipient, String message);

    /**
     * Returns the channel name (for logging/display).
     */
    String getChannelName();
}
