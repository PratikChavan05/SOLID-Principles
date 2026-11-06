package solid.ocp.bad;

/**
 * ❌ VIOLATES Open/Closed Principle
 *
 * Every time we add a new shape, we must MODIFY this existing class
 * by adding another if-else branch. This is "open for modification"
 * which can introduce bugs in previously working code.
 *
 * Adding a Triangle? Modify AreaCalculator.
 * Adding a Pentagon? Modify AreaCalculator again.
 * This never ends and gets increasingly fragile.
 */
public class AreaCalculator {

    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            return rect.width * rect.height;

        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;

        }
        // ❌ Every new shape requires modifying this method!
        // else if (shape instanceof Triangle) { ... }
        // else if (shape instanceof Pentagon) { ... }

        throw new IllegalArgumentException("Unknown shape: " + shape.getClass().getSimpleName());
    }
}
