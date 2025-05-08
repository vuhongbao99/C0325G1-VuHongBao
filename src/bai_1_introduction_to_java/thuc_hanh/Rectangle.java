package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width : ");
        width = scanner.nextFloat(); //Nhập Chiều Rộng

        System.out.println("Enter height : ");
        height = scanner.nextFloat(); // Nhập chiều dài

        float area = width * height;
        System.out.println("area : " + area);
    }
}
