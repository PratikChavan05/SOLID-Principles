package solid.ocp.good;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Rectangle(" + width + " x " + height + ")";
    }
}
