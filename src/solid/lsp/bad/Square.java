package solid.lsp.bad;

/**
 * ❌ Square BREAKS Liskov Substitution Principle!
 *
 * Problem: Square overrides setWidth/setHeight to keep sides equal.
 * This breaks Rectangle's contract (width and height are independent).
 *
 * Any code that works correctly with Rectangle will BREAK with Square:
 *
 *   Rectangle r = new Square(5);
 *   r.setWidth(10);
 *   r.setHeight(5);
 *   // Client expects area = 10 * 5 = 50
 *   // Actual area = 5 * 5 = 25  ← BUG! Contract violation!
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    /**
     * ❌ Overrides to enforce square invariant, but this BREAKS
     * the parent's contract that width and height are independent.
     */
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;  // Surprising side effect!
    }

    @Override
    public void setHeight(double height) {
        this.width = height;  // Surprising side effect!
        this.height = height;
    }
}
