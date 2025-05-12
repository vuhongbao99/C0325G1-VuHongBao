package bai_2_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int mounth = 1;
        double interestRate;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investerment amount");
        money = scanner.nextDouble();

        System.out.println("Enter number of mounth");
        mounth = scanner.nextInt();

        System.out.println("Enter annual interest rate in percentage");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;

        for (int i = 0; i < mounth; i++){
            totalInterest = money *(interestRate/100/12) *mounth;

        }
        System.out.println("Total of interest : " + totalInterest);

    }
}
