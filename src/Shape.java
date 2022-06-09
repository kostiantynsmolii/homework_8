abstract class Shape implements Comparable {
    abstract public double calculateArea();
    abstract public String myName();

    public void showName(){
        System.out.println("Имя фигуры: " + myName());
    }

    @Override
    public String compareTo(Shape s) {
        if (this.calculateArea() > s.calculateArea()) {
            return myName() + " больше, чем " + s.myName();
        }
        return s.myName() + " больше, чем " + myName();
    }
}


