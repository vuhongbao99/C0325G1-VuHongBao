package bai_9_automated_testing.bai_tap_3;

// FizzBuzzTranslate.java
public class FizzBuzzTranslate {

    public static void main(String[] args) {
        runAllTests();
    }

    // Logic chính
    public static String translate(int number) {
        if (number <= 0 || number > 100) {
            return "Out of range";
        }

        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        if ((divisibleBy3 && divisibleBy5) || (contains3 && contains5)) {
            return "FizzBuzz";
        } else if (divisibleBy3 || contains3) {
            return "Fizz";
        } else if (divisibleBy5 || contains5) {
            return "Buzz";
        } else {
            return readNumber(number);
        }
    }

    //  Đọc số thành chữ (từ 1 đến 100)
    public static String readNumber(int number) {
        String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

        if (number < 10) return units[number];
        if (number < 20) return "mười " + units[number % 10];

        int tens = number / 10;
        int ones = number % 10;

        String result = units[tens] + " mươi";
        if (ones > 0) {
            result += " " + units[ones];
        }
        return result.trim();
    }

    //  Test thủ công
    public static void runAllTests() {
        runTestCase(3, "Fizz");
        runTestCase(5, "Buzz");
        runTestCase(15, "FizzBuzz");
        runTestCase(13, "Fizz");
        runTestCase(52, "Buzz");
        runTestCase(26, "hai mươi sáu");
        runTestCase(101, "Out of range");
    }

    public static void runTestCase(int number, String expected) {
        String result = translate(number);
        if (result.equals(expected)) {
            System.out.println("PASSED: " + number + " → " + result);
        } else {
            System.out.println(" FAILED: " + number + " → " + result + " (expected: " + expected + ")");
        }
    }
}
