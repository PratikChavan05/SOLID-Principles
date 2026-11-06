package solid.dip.good;

import java.util.List;

/**
 * ✅ FOLLOWS Dependency Inversion Principle
 *
 * High-level module depends on ABSTRACTION (MessageSender interface),
 * NOT on concrete low-level modules (EmailSender, SMSSender, etc.).
 *
 * Benefits:
 *   1. Swap notification channels without touching this class
 *   2. Easy to unit-test with mock MessageSender
 *   3. Supports multiple channels simultaneously
 *   4. New channels require ZERO modifications here
 */
public class NotificationService {

    // ✅ Depends on abstraction, not concrete classes
    private final List<MessageSender> senders;

    /**
     * Constructor Injection: dependencies are provided from outside.
     * The caller decides which concrete implementations to use.
     *
     * This is also known as "Inversion of Control" (IoC).
     */
    public NotificationService(List<MessageSender> senders) {
        this.senders = senders;
    }

    /**
     * Convenience constructor for a single sender.
     */
    public NotificationService(MessageSender sender) {
        this(List.of(sender));
    }

    /**
     * Notify user via ALL configured channels.
     */
    public void notifyUser(String userId, String message) {
        System.out.println("Preparing notification for user: " + userId);
        for (MessageSender sender : senders) {
            System.out.println("  Sending via " + sender.getChannelName() + "...");
            sender.send(userId, message);
        }
        System.out.println("All notifications sent.\n");
    }
}
