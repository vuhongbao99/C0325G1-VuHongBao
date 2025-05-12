package bai_3_array_to_java;

public class DemoArrayJava {
    public static void main(String[] args) {
        int[] arrayInt = {40,12,5,8,14};
        String[] arrayString = {"Hello", "Java", "NodeJs"};
        for (int i = 0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }
        for (String value: arrayString) {
            System.out.println("Foreach " + value);
        }
    }


}
