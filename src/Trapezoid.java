public class Trapezoid extends Shape implements Comparable {
    private final String name;
    private final double side1;
    private final double side2;
    private final double height;

    public Trapezoid(String name, double side1, double side2, double height) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "name='" + name + '\'' +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", hight=" + height +
                '}';
    }

    @Override
    public double calculateArea() {
        return (side1 + side2) / (2* height);
    }

    @Override
    public String myName() {
        return name;
    }
}






