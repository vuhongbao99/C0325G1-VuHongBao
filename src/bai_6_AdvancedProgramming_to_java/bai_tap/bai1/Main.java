package bai_6_AdvancedProgramming_to_java.bai_tap.bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(2.0, "green", 5.0);
        System.out.println(cylinder.toString());
    }
}
