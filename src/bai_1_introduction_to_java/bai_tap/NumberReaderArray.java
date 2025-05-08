package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberReaderArray {
    public static void main(String[] args) {

        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};


        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else if (number < 10) {

            System.out.println(ones[number]);
        } else if (number < 20) {

            System.out.println(teens[number - 10]);
        } else if (number < 100) {

            int ten = number / 10;
            int one = number % 10;
            String result = tens[ten];
            if (one != 0) result += " " + ones[one];
            System.out.println(result);
        } else {

            int hundred = number / 100;
            int remainder = number % 100;
            String result = ones[hundred] + " hundred";

            if (remainder > 0) {
                result += " and ";
                if (remainder < 10) {
                    result += ones[remainder];
                } else if (remainder < 20) {
                    result += teens[remainder - 10];
                } else {
                    int ten = remainder / 10;
                    int one = remainder % 10;
                    result += tens[ten];
                    if (one != 0) result += " " + ones[one];
                }
            }

            System.out.println(result);
        }
    }
}

