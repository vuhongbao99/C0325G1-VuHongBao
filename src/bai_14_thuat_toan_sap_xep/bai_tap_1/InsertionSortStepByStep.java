package bai_14_thuat_toan_sap_xep.bai_tap_1;

import java.util.Scanner;
import java.util.Arrays;

public class InsertionSortStepByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Thuật toán sắp xếp chèn (Insertion Sort)
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Dịch các phần tử lớn hơn current sang phải
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;

            // In ra từng bước
            System.out.println("Step " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

