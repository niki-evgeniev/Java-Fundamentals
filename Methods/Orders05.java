package Methods;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        calculatorPrice(drink, count);

    }

    public static void calculatorPrice(String drink, int a) {
        double results = 0;
        switch (drink) {
            case "coffee":
                results = a * 1.50;
                break;
            case "water":
                results = a * 1.00;
                break;
            case "coke":
                results = a * 1.40;
                break;
            case "snacks":
                results = a * 2.00;
                break;
        }
        System.out.printf("%.2f", results);
    }
}
