package ExercisesMethods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String console = scanner.nextLine();
        while (!console.equals("END")) {
            int n = Integer.parseInt(console);
            palindromeIntegers(n);
            console = scanner.nextLine();
        }
    }

    public static void palindromeIntegers(int n) {
        int firstNumber = 0;
        int secondNumber = 0;
        int secN = n;
        //взимаме 1вото число
        while (n > 0) {
            firstNumber = n % 10;
            n = n / 10;
        }
        for (int i = 0; i < 1; i++) {
            secondNumber = secN % 10;


            if (firstNumber == secondNumber) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
