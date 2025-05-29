package bai_15_xu_ly_ngoai_le;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TriangleView {
    private Scanner scanner = new Scanner(System.in);

    public double inputSide(String sideName) {
        double side = -1;
        while (true) {
            try {
                System.out.print("Nhập cạnh " + sideName + ": ");
                side = scanner.nextDouble();
                if (side <= 0) {
                    System.out.println("Cạnh phải > 0. Nhập lại.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập số!");
                scanner.next(); // Xóa input lỗi
            }
        }
        return side;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

