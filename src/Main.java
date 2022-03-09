public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        Circle circle = new Circle(5);
        figures[0] = new Rectangle(10);
        figures[1] = new Rectangle(20, 30);
        figures[2] = new Triangle(15);
        figures[3] = new Triangle(25, 35);
        figures[4] = new Circle(40);
        figures[5] = new Circle(circle);
        for (Figure figure : figures) {
            System.out.printf("Объект - %s\n", figure.getName());
            System.out.printf("Площадь %s равна - %.2f%n", printFigureName(figure.getName()), figure.area());
            System.out.println();
        }
    }

    public static String printFigureName(String name) {
        StringBuilder stringBuilder = new StringBuilder(name);
        if (name.charAt(name.length() - 1) == 'ь') {
            stringBuilder.setCharAt(name.length() - 1, 'и');
        } else {
            stringBuilder.append('а');
        }
        return String.valueOf(stringBuilder);
    }
}
