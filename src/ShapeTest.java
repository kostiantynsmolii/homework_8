public class ShapeTest {
    public static void main(String[] args) {
        Shape quad = new Quad("квадрат", 20);
        Shape rectangle = new Rectangle("прямоугольник", 20, 30);
        Shape circle = new Circle("круг", 15);
        Shape triangle = new Triangle("треугольник", 3, 4, 6);
        Shape trapezoid = new Trapezoid("трапеция", 12, 5, 5);

        System.out.println(quad);
        System.out.println("Площадь: " + quad.calculateArea());
        System.out.println("Разница площадей: " + quad.compareTo(rectangle));

        System.out.println(rectangle);
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Разница площадей: " + rectangle.compareTo(quad));

        System.out.println(circle);
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Разница площадей: " + circle.compareTo(rectangle));

        System.out.println(triangle);
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Разница площадей: " +triangle.compareTo(circle));

        System.out.println(trapezoid);
        System.out.println("Площадь: " + trapezoid.calculateArea());
        System.out.println("Разница площадей: " + trapezoid.compareTo(triangle));
        System.out.println("------");
        Shape[] figure = {
                new Rectangle("прямоугольник", 12, 2),
                new Triangle("треугольник", 8, 5, 5),
                new Circle("круг", 3),
                new Trapezoid("трапеция",5, 4, 4),
                new Quad("квадрат", 10)};

                for(Shape fig : figure)

        System.out.println(fig.myName() + ": area = " + fig.calculateArea());
    }
}
