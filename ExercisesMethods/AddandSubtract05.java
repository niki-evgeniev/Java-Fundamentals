package ExercisesMethods;

import java.util.Scanner;

public class AddandSubtract05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        printSum(a,b,c);

    }
    private static void printSum (int a, int b, int c) {
        int results = a + b - c;
        System.out.println(results);
    }
}
