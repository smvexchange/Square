public class Rectangle extends Figure {
    public Rectangle(double width, double height) {
        super(width, height, "прямоугольник");
    }

    public Rectangle(double side) {
        super(side, "квадрат");
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }
}
