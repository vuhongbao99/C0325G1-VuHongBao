package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        double answer = (c - b)/a;

        if (a!=0){
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else {
            if (b==c){
                System.out.println("The solution is all x");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
