package bai_7_interface_to_java.bai2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Square(4);
        shapes[2] = new Square(2);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println("-----");
        }
    }
}

