package bai_9_automated_testing.bai_tap_1;

// NextDayCalculator.java
public class NextDayCalculator {

    public static void main(String[] args) {
        runAllTests(); // chạy khi chạy chương trình
    }

    // 👉 Extracted Method: Hàm tính ngày kế tiếp
    public static String findNextDay(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        if (day < daysInMonth[month - 1]) {
            nextDay++;
        } else {
            nextDay = 1;
            if (month < 12) {
                nextMonth++;
            } else {
                nextMonth = 1;
                nextYear++;
            }
        }

        return formatDate(nextDay, nextMonth, nextYear);
    }

    // 👉 Extracted Method: Kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // 👉 Extracted Method: Định dạng ngày thành chuỗi
    public static String formatDate(int day, int month, int year) {
        return day + "/" + month + "/" + year;
    }

    // 👉 Extracted Method: Chạy tất cả test case
    public static void runAllTests() {
        runTestCase(1, 1, 2018, "2/1/2018");
        runTestCase(31, 1, 2018, "1/2/2018");
        runTestCase(28, 2, 2018, "1/3/2018");
        runTestCase(29, 2, 2020, "1/3/2020");
        runTestCase(31, 12, 2018, "1/1/2019");
    }

    // 👉 Extracted Method: So sánh kết quả thực tế
    public static void runTestCase(int day, int month, int year, String expected) {
        String result = findNextDay(day, month, year);
        if (result.equals(expected)) {
            System.out.println(" PASSED: " + day + "/" + month + "/" + year + " → " + result);
        } else {
            System.out.println(" FAILED: " + day + "/" + month + "/" + year +
                    " → " + result + " (expected: " + expected + ")");
        }
    }
}

