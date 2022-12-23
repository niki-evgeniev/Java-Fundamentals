package DataTypesandVariables;

import java.util.Scanner;

public class PoundstoDollars02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollar = Double.parseDouble(scanner.nextLine());
        double total = dollar * 1.36;

        System.out.printf("%.3f", total);
    }
}
