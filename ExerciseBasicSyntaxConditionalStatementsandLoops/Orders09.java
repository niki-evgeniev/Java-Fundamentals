package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Orders09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.00;


        for (int i = 1; i <=n ; i++) {
            double capsule = Double.parseDouble(scanner.nextLine());
            double days = Double.parseDouble(scanner.nextLine());
            double priceCap = Double.parseDouble(scanner.nextLine());
            double price = 0;
            price = capsule * days * priceCap;
            totalPrice += price;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
