package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String days = scanner.nextLine();
        double price = 0;

        if (group.equals("Students")) {
            switch (days) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
        } else if (group.equals("Business")) {
            switch (days) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }
        } else if (group.equals("Regular")) {
            switch (days) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
        }
        if (group.equals("Students") && people >= 30) {
            System.out.printf("Total price: %.2f", people * (price - price * 0.15));
        } else if (group.equals("Business") && people >= 100) {
            System.out.printf("Total price: %.2f", (people - 10) * price);
        } else if (group.equals("Regular") && people >= 10 && people <= 20) {
            System.out.printf("Total price: %.2f", people * (price * 0.95));
        } else {
            System.out.printf("Total price: %.2f", people * price);
        }
    }
}
