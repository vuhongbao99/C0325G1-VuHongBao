package bai_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class switch_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào ngày thang muốn tính trong ngay");
        int mounth = scanner.nextInt();


        String daysInmounth;
        switch (mounth){
            case 2:
                daysInmounth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInmounth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInmounth = "30";
                break;
            default:
                daysInmounth = "";
                break;




        }
        if (daysInmounth == ""){
            System.out.println("Invalid input");
        }else {
            System.out.printf("The mounth '%d' has %s days", mounth,daysInmounth);
        }
    }
}
