package bai_4_OOP_to_java.bai_tap;

public class QuadraticEquation {
    private double a, b, c;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Nghiệm thứ nhất
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    // Nghiệm thứ hai
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}

