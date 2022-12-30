package Methods;

import java.util.Scanner;

public class PrintingTriangle03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTriangle(number);
    }

    private static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printNumber(1, i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printNumber(1, i);
        }

    }

    public static void printNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
