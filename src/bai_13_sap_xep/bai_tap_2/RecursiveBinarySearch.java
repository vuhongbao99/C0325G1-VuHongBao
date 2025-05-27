package bai_13_sap_xep.bai_tap_2;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Nhập mảng
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //  Sắp xếp mảng
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        //  Nhập giá trị cần tìm
        System.out.print("Enter value to search: ");
        int value = scanner.nextInt();

        //  Gọi hàm tìm kiếm đệ quy
        int result = binarySearch(arr, 0, arr.length - 1, value);

        if (result == -1) {
            System.out.println("Value not found in array.");
        } else {
            System.out.println("Value found at index: " + result);
        }
    }

    // Hàm tìm kiếm nhị phân đệ quy
    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1; // không tìm thấy
        }

        int middle = (left + right) / 2;

        if (arr[middle] == value) {
            return middle;
        } else if (arr[middle] < value) {
            return binarySearch(arr, middle + 1, right, value);
        } else {
            return binarySearch(arr, left, middle - 1, value);
        }
    }
}

