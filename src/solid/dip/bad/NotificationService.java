package solid.dip.bad;

/**
 * ❌ VIOLATES Dependency Inversion Principle
 *
 * The high-level module (NotificationService) directly depends on
 * a low-level module (EmailSender). This creates tight coupling.
 *
 * Problems:
 *   1. Can't switch to SMS/Push without modifying NotificationService
 *   2. Can't unit-test NotificationService without a real EmailSender
 *   3. Every change to EmailSender's API ripples up to NotificationService
 *
 * The dependency arrow points DOWNWARD:
 *   NotificationService → EmailSender (high depends on low = BAD)
 */
public class NotificationService {

    // ❌ Direct dependency on a CONCRETE class (low-level module)
    private EmailSender emailSender;

    public NotificationService() {
        // ❌ Creating the dependency internally — tightest coupling possible
        this.emailSender = new EmailSender();
    }

    public void notifyUser(String userId, String message) {
        System.out.println("Preparing notification for user: " + userId);
        // ❌ Hardcoded to email — can't switch notification channel
        emailSender.sendEmail(userId, message);
    }
}
