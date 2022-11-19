package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        double sum = 0;
        while (!word.equals("Start")) {
            Double coin = Double.parseDouble(word);
            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                sum += coin;
            }
            word = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum < 2.0) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        sum -= 2.0;
                        System.out.println("Purchased Nuts");
                        break;
                    }
                case "Water":
                    if (sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        sum -= 0.7;
                        System.out.println("Purchased Water");
                        break;
                    }
                case "Crisps":
                    if (sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        break;
                    } else {
                        sum -= 1.5;
                        System.out.println("Purchased Crisps");
                        break;
                    }
                case "Soda":
                    if (sum < 0.8){
                        System.out.println("Sorry, not enough money");
                        break;
                    }else{
                        sum -= 0.8;
                        System.out.println("Purchased Soda");
                        break;
                    }
                case "Coke":
                    if (sum < 1.0){
                        System.out.println("Sorry, not enough money");
                        break;
                    }else{
                        sum -= 1.0;
                        System.out.println("Purchased Coke");
                        break;
                    }
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
