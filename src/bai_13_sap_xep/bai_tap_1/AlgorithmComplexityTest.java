package bai_13_sap_xep.bai_tap_1;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        //  Tính tần suất xuất hiện của các ký tự
        int[] frequentChar = new int[255]; // Bảng ASCII 255 ký tự

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            int ascii = (int) ch;
            frequentChar[ascii]++;
        }

        // Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;
        char character = (char) 255;

        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                character = (char) i;
            }
        }

        // Kết quả
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}

