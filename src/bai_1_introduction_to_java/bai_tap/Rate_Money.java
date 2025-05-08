package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Rate_Money {
    public static void main(String[] args) {
        final double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("input the usd : ");
        double USD = scanner.nextDouble();

        double VND = USD * rate;
        System.out.printf("Equivalent value: %.0f VND\n",VND);
    }
}
