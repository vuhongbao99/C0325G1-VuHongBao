package bai_7_interface_to_java.bai_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        Random random = new Random();

        for (Resizeable shape : shapes) {
            System.out.println("Before resize: " + shape);
            double percent = 1 + random.nextInt(100);
            shape.resize(percent);
            System.out.println("After resize (" + percent + "%): " + shape);
            System.out.println("------");
        }
    }
}

