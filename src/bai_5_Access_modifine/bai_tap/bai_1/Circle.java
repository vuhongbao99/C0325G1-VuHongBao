package bai_5_Access_modifine.bai_tap.bai_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle() {
    }


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

