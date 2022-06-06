public class Circle extends Shape implements Comparable {

    private final String name;
    private static final double PI = Math.PI;
    private final double diameter;

    public Circle(String name, double diameter) {
        this.diameter = diameter;
        this.name = name;

    }

    @Override
    public double calculateArea() {
        double radius = diameter / 2;
        return PI * radius * radius;
    }

    @Override
    public String myName() {
        return name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
