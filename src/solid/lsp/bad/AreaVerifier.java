package solid.lsp.bad;

/**
 * ❌ This class demonstrates how LSP violation causes bugs.
 *
 * The method resizeAndCalculate() works correctly with Rectangle
 * but produces WRONG results with Square — even though Square
 * extends Rectangle. This is the essence of LSP violation.
 */
public class AreaVerifier {

    /**
     * This method assumes Rectangle's contract: width and height are independent.
     * It will produce INCORRECT results when given a Square.
     */
    public static void resizeAndCalculate(Rectangle rect) {
        rect.setWidth(10);
        rect.setHeight(5);

        double expectedArea = 10 * 5; // = 50
        double actualArea = rect.calculateArea();

        System.out.println("Expected area: " + expectedArea);
        System.out.println("Actual area:   " + actualArea);

        if (actualArea != expectedArea) {
            System.out.println("❌ BUG! LSP violated — subtype broke parent's contract!");
        } else {
            System.out.println("✅ Correct! Behaves as expected.");
        }
    }

    public static void main(String[] args) {
        System.out.println("── Testing with Rectangle ──");
        resizeAndCalculate(new Rectangle(0, 0));
        // Output: ✅ Correct!

        System.out.println("\n── Testing with Square ──");
        resizeAndCalculate(new Square(0));
        // Output: ❌ BUG! Square produces area = 25 instead of 50
    }
}
