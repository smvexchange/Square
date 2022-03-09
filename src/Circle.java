public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        super(0, "окружность");
        this.radius = radius;
    }

    public Circle(Circle obj) {
        super(obj);
        this.radius = obj.radius;
    }

    @Override
    public double area() {
        double PI = 3.1415926;
        return PI * radius * radius;
    }
}
