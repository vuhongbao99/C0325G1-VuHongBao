package bai_3_array_to_java.bai_tap;

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the column index to sum (0 to " + (cols - 1) + "): ");
        int colIndex = scanner.nextInt();

        if (colIndex < 0 || colIndex >= cols) {
            System.out.println("Invalid column index.");
            return;
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][colIndex];
        }

        System.out.println("The sum of column " + colIndex + " is: " + sum);
    }
}
