package bai_3_array_to_java.bai_tap;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("The smallest value in the array is: " + min);
    }
}

