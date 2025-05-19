package bai_7_interface_to_java.bai_1;

public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        side += side * percent / 100;
    }

    @Override
    public String toString() {
        return "Square - side: " + side + ", area: " + getArea();
    }
}

