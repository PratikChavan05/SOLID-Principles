package solid.lsp.good;

import java.util.List;

/**
 * ✅ This verifier works correctly with ALL Shape implementations.
 *
 * Unlike the bad example, substituting any Shape implementation
 * never produces unexpected behavior. LSP is satisfied.
 */
public class AreaVerifier {

    /**
     * Works correctly with any Shape — no surprises, no contract violations.
     */
    public static void printAreas(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.printf("  %s → Area = %.2f%n", shape.describe(), shape.calculateArea());
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Rectangle(10, 5),
                new Square(7),
                new Rectangle(3, 4),
                new Square(10)
        );

        System.out.println("── All shapes work correctly via Shape interface ──");
        printAreas(shapes);
        // Every shape calculates area correctly — no LSP violations!
    }
}
