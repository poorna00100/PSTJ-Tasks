import java.util.*;
import java.util.function.BiFunction;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        expression = expression.replaceAll("\\s+", "");
        int operatorIndex = -1;
        char operator = ' ';
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '/') {
                operatorIndex = i;
                operator = ch;
                break;
            }
        }
        if (operatorIndex == -1) {
            System.out.println("Test Failed");
            sc.close();
            return;
        }
        int a = Integer.parseInt(
                expression.substring(0, operatorIndex)
        );
        int b = Integer.parseInt(
                expression.substring(operatorIndex + 1)
        );
        if (operator == '+') {
            BiFunction<Integer, Integer, Integer> add =
                    (x, y) -> x + y;
            int result = add.apply(a, b);
            if (result == 30) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
            }
        }
        else if (operator == '/') {
            if (b == 0) {
                System.out.println("Test Failed");
            } else {
                BiFunction<Integer, Integer, Integer> divide =
                        (x, y) -> x / y;
                int result = divide.apply(a, b);
                if (result == a / b) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }
            }
        }
        sc.close();
    }
}
