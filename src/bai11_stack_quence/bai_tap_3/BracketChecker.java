package bai11_stack_quence.bai_tap_3;

import java.util.Stack;

public class BracketChecker {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Nếu là ngoặc mở thì đẩy vào stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Nếu là ngoặc đóng thì kiểm tra stack
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }

        // Nếu stack còn phần tử thì ngoặc chưa khớp
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String[] expressions = {
                "s * (s – a) * (s – b) * (s – c)",       // true
                "(– b + (b2 – 4*a*c)^0.5)/(2*a)",       // true
                "s * (s – a) * (s – b * (s – c)",       // false
                "s * (s – a) * s – b) * (s – c)"        // false
        };

        for (String expr : expressions) {
            System.out.println(expr + " => " + (isBalanced(expr) ? "Well" : "???"));
        }
    }
}

