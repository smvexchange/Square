public class Triangle extends Figure {
    public Triangle(double side) {
        super(side, "треугольник");
    }

    public Triangle(double width, double height) {
        super(width, height, "треугольник");
    }

    @Override
    public double area() {
        return getWidth() * getHeight() / 2;
    }
}
