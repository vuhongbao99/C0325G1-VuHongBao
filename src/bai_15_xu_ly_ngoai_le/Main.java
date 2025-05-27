package bai_15_xu_ly_ngoai_le;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            Triangle triangle = new Triangle(a, b, c);
            System.out.println(" Hợp lệ: " + triangle);

        } catch (IllegalTriangleException e) {
            System.out.println(" Ngoại lệ: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Lỗi nhập dữ liệu không hợp lệ.");
        }
    }
}

