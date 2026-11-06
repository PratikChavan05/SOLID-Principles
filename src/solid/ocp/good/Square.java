package solid.ocp.good;

public class Square implements Shape{

    private final double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return edge*edge;
    }

    @Override
    public String getName() {
        return "Squre"+edge;
    }
}
