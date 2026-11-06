package solid.lsp.bad;

/**
 * ❌ VIOLATES Liskov Substitution Principle
 *
 * Classic example: Square extends Rectangle.
 * Mathematically, a square IS a rectangle. But in OOP, substitutability breaks.
 *
 * A Rectangle's contract says: width and height are independent.
 * A Square breaks that contract by coupling them.
 */
public class Rectangle {

    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Clients expect: setting width does NOT affect height.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Clients expect: setting height does NOT affect width.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    public double calculateArea() {
        return width * height;
    }
}
