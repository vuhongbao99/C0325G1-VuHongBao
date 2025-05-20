package bai_9_automated_testing.bai_tap_2;

// TriangleClassifier.java
public class TriangleClassifier {

    public static void main(String[] args) {
        runAllTests();
    }

    //  Method  tam giác
    public static String classifyTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "không phải là tam giác";
        } else if (a == b && b == c) {
            return "tam giác đều";
        } else if (a == b || b == c || a == c) {
            return "tam giác cân";
        } else {
            return "tam giác thường";
        }
    }

    //Test thủ công
    public static void runAllTests() {
        runTestCase(2, 2, 2, "tam giác đều");
        runTestCase(2, 2, 3, "tam giác cân");
        runTestCase(3, 4, 5, "tam giác thường");
        runTestCase(8, 2, 3, "không phải là tam giác");
        runTestCase(2, 2, 5, "không phải là tam giác");
        runTestCase(1, 1, 3, "không phải là tam giác");
    }

    //  Method kiểm tra từng test case
    public static void runTestCase(int a, int b, int c, String expected) {
        String result = classifyTriangle(a, b, c);
        if (result.equals(expected)) {
            System.out.println("PASSED: " + a + ", " + b + ", " + c + " → " + result);
        } else {
            System.out.println(" FAILED: " + a + ", " + b + ", " + c + " → " + result +
                    " (expected: " + expected + ")");
        }
    }
}

