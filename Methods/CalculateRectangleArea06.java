package Methods;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int results = calculateArea(a, b);
        System.out.println(results);
    }

    public static int calculateArea(int a, int b) {
        int result = a * b;
        return result;
    }
}
