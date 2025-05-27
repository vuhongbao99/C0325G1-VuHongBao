package bai_14_thuat_toan_sap_xep.bai_tap_2;

public class InsertionSort {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn current về phía sau
            while (j >= 0 && list[j] > current) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 2, 9, 1, 7};

        System.out.println("Before sorting:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        insertionSort(list);

        System.out.println("\nAfter sorting:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

