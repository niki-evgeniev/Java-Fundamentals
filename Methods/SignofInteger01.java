package Methods;

import java.util.Scanner;

public class SignofInteger01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printNegativeOrPositive(number);


    }

    public static void printNegativeOrPositive(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number == 0) {
            System.out.printf("The number 0 is zero.");
        }
    }
}
