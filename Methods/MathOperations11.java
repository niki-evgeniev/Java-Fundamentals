package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double results = calculate(a, operator, b);

        DecimalFormat decimal = new DecimalFormat("0.##");
        System.out.println(decimal.format(results));

    }

    public static double calculate(int a, String operator, int b) {
        double results = 0;
        switch (operator) {
            case "/":
                results = a * 1.00 / b;
                break;
            case "*":
                results = a * 1.00 * b;
                break;
            case "+":
                results = a * 1.00 + b;
                break;
            case "-":
                results = a * 1.00 - b;
                break;

        }
        return results;
    }
}
