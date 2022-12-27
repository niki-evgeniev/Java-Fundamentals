package ExercisesMethods;

import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        long factorialOne = factorialDivision(firstNumber);
        long factorialTwo = factorialDivision(secondNumber);
        double results = factorialOne * 1.00 / factorialTwo;
        System.out.printf("%.2f", results);


    }

    public static long factorialDivision(int number) {
        long results = 1;
        for (int i = 1; i <= number; i++) {
            results = results * i;

        }
        return results;
    }
}
