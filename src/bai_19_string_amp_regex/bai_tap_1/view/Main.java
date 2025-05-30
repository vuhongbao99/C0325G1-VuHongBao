package bai_19_string_amp_regex.bai_tap_1.view;

import bai_19_string_amp_regex.bai_tap_1.controller.ClassNameValidatorController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassNameValidatorController validator = new ClassNameValidatorController();

        System.out.print("Nhập tên lớp học cần kiểm tra: ");
        String input = scanner.nextLine();

        if (validator.checkValidClassName(input)) {
            System.out.println("Tên lớp hợp lệ.");
        } else {
            System.out.println("Tên lớp không hợp lệ.");
        }
    }
}

