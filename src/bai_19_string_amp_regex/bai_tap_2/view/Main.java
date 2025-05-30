package bai_19_string_amp_regex.bai_tap_2.view;

import bai_19_string_amp_regex.bai_tap_2.controller.PhoneNumberValidatorController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneNumberValidatorController controller = new PhoneNumberValidatorController();

        System.out.print("Nhập số điện thoại: ");
        String input = scanner.nextLine();

        if (controller.checkValidPhone(input)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}

