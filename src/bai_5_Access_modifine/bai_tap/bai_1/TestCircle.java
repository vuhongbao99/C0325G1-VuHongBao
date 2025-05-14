package bai_5_Access_modifine.bai_tap.bai_1;

import bai_5_Access_modifine.bai_tap.bai_1.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);

        System.out.println("Circle1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        System.out.println("\nCircle2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}

