package bai11_stack_quence.bai_tap_2;

import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Chuyển chuỗi về cùng 1 định dạng: in thường, bỏ ký tự không phải chữ cái
        String formatted = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Đưa từng ký tự vào stack và queue
        for (char ch : formatted.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // So sánh từng phần tử lấy ra từ stack và queue
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("=> Đây là chuỗi Palindrome.");
        } else {
            System.out.println("=> Đây KHÔNG phải là chuỗi Palindrome.");
        }
    }
}

