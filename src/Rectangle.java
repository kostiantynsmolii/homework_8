public class Rectangle extends Shape implements Comparable {
    String name;
    double side1;
    double side2;

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    public Rectangle(String name, double side1, double side2) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1*side2;

    }

    @Override
    public String myName() {
        return name;
    }
}


