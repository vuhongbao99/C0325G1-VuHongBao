package bai_7_interface_to_java.bai2;

public class Square extends Shape implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square - side: " + side + ", area: " + getArea();
    }
}

