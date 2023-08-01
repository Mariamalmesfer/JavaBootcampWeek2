public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double width) {
        setWidth(width);
        setLength(width);
    }


    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getWidth());
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }




}












