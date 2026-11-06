package solid.ocp.good;

/**
 * ✅ FOLLOWS Open/Closed Principle
 *
 * This interface is the key abstraction. Any new shape simply
 * implements this interface — no existing code needs to change.
 *
 * The system is:
 *   - OPEN for extension (add new Shape implementations freely)
 *   - CLOSED for modification (AreaCalculator never changes)
 */
public interface Shape {

    /**
     * Each shape knows how to calculate its own area.
     * This moves the logic to where it belongs.
     */
    double calculateArea();

    /**
     * Each shape provides a display name.
     */
    String getName();
}
