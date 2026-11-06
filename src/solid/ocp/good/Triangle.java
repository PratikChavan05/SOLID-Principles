package solid.ocp.good;

/**
 * ✅ Adding a Triangle requires ZERO changes to existing code.
 * We simply create a new class that implements Shape.
 * AreaCalculator works with it automatically!
 */
public class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getName() {
        return "Triangle(base=" + base + ", height=" + height + ")";
    }
}
