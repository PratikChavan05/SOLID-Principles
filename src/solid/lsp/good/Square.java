package solid.lsp.good;

/**
 * ✅ Square implements Shape independently — no inheritance from Rectangle.
 *
 * Square has its own contract (one side length) and doesn't break anyone else's.
 * Both Rectangle and Square can be used interchangeably through the Shape interface
 * without any surprises.
 */
public class Square implements Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String describe() {
        return "Square(side=" + side + ")";
    }

    public double getSide() { return side; }
}
