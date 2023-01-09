package conditions_and_loops;

import java.util.Scanner;

public class SimpleCalculator {
    private static final Scanner input = new Scanner(System.in);

    public static double simpleCalculator(char op, int num1, int num2) {
//        System.out.println("enter the operator");
//        char op = input.next().trim().charAt(0);
        while (true) {
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//                System.out.println("enter 2 operands");
//                int num1 = input.nextInt();
//                int num2 = input.nextInt();
                if (op == '+') {
                    return num1 + num2;
                } else if (op == '-') {
                    return num1 - num2;
                } else if (op == '*') {
                    return num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        return (float) (num1 / num2);
                    }
                } else {
                    return num1 % num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
        }
        return -1;
    }
}
