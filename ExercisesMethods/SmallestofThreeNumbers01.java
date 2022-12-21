package ExercisesMethods;

import java.util.Scanner;

public class SmallestofThreeNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        smallNumberOfThree(a, b, c);

    }

    public static void smallNumberOfThree(int firstNumber, int secondNumber, int threeNumber) {
        if (firstNumber <= secondNumber && firstNumber <= threeNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber <= firstNumber && secondNumber <= threeNumber) {
            System.out.println(secondNumber);
        } else if (threeNumber <= firstNumber && threeNumber <= secondNumber) {
            System.out.println(threeNumber);
        }
    }
}
