package bai11_stack_quence.bai_tap_1;

import java.util.Stack;
import java.util.Scanner;

public class DecimalToBinary {

    public static String convertToBinary(int number) {
        Stack<Integer> stack = new Stack<>();

        // Chia liên tục cho 2 và lưu phần dư vào Stack
        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }

        // Đọc các phần tử từ Stack để tạo số nhị phân
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thập phân cần chuyển đổi: ");
        int decimalNumber = scanner.nextInt();

        String binaryResult = convertToBinary(decimalNumber);
        System.out.println("Số nhị phân tương ứng: " + binaryResult);
    }
}

