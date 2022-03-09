public class Figure {
    private final double width;
    private final double height;
    private final String name;

    public Figure(double side, String name) {
        width = height = side;
        this.name = name;
    }

    public Figure(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public Figure(Figure obj) {
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        System.out.println("This method must be overridden");
        return 0.0;
    }
}
