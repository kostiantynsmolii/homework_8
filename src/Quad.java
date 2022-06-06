public class Quad extends Shape implements Comparable {
    private String name;
    private double side1;

    public Quad(String name, double side1) {
        this.name = name;
        this.side1 = side1;

    }

    @Override
    public String toString() {
        return "Quad{" +
                "name='" + name + '\'' +
                ", side1=" + side1 +
                '}';
    }

    @Override
    public double calculateArea() {
        return side1*side1;

    }

    @Override
    public String myName() {
        return name;
    }
}

