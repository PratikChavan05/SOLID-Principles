package solid.ocp.good;

import java.util.List;

/**
 * ✅ This calculator NEVER needs to change when new shapes are added.
 * It works with the Shape abstraction, not concrete classes.
 *
 * It is:
 *   - CLOSED for modification (this code is stable and final)
 *   - OPEN for extension (works with any future Shape implementation)
 */
public class AreaCalculator {

    /**
     * Calculate total area of any collection of shapes.
     * Adding a Hexagon, Star, or any new shape? This method still works.
     */
    public double calculateTotalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }
        return total;
    }

    /**
     * Print areas for each shape. Also works with any future shape.
     */
    public void printAreas(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.printf("  %s → Area = %.2f%n", shape.getName(), shape.calculateArea());
        }
        System.out.printf("  Total Area = %.2f%n", calculateTotalArea(shapes));
    }

    public double calculateArea(Shape shape){
        double area = shape.calculateArea();
        return area;
    }

}
