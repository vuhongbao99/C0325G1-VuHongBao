package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class RateMoney {
    public static void main(String[] args) {
        final  double rate = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the USD: ");
        double USD = scanner.nextDouble();

        if (USD < 0) {
            System.out.println("Error: USD must be a non-negative number.");
        } else if (USD > 1000000000) {
            System.out.println("Error: The amount is too large.");
        } else {
            double VND = USD * rate;
            System.out.printf("Equivalent value: %.0f VND\n", VND);
        }
    }
}
