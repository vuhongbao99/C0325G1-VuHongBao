package bai_4_OOP_to_java.bai_tap;

import java.util.Random;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        StopWatch sw = new StopWatch();
        sw.start();

        // Selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        sw.stop();
        System.out.println("Thời gian thực thi (ms): " + sw.getElapsedTime());
    }
}
