package bai_3_array_to_java.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to be deleted: ");
        int x = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            n--;
            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Value not found in the array.");
        }
    }
}

