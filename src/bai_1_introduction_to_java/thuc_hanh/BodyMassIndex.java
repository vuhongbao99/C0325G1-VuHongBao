package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight;
        System.out.println("Nhâp chỉ số cân nặng: ");
         weight = scanner.nextFloat();

         float height;
        System.out.println("Nhập vào chỉ số chiều cao ");
        height = scanner.nextFloat();


        float BMI = weight / (height*height);
        if (BMI <18.5){
            System.out.printf("Underweight: "+ BMI);
        } else if (18.5 <= BMI && BMI <25) {
            System.out.printf("Normal: "+ BMI);
        } else if (25<= BMI && BMI < 30) {
            System.out.printf("Overweight" + BMI);
        } else if (BMI >= 30) {
            System.out.printf("Obese:" +BMI);
        }
    }
}
