package ExerciseBasicSyntaxConditionalStatementsandLoops.Ex;

import java.util.Scanner;

public class Messages05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= count; i++) {
            String number = scanner.nextLine();
            int length = number.length();
            int number1 = Integer.parseInt(number);
            int mainDigit = number1 % 10;
            int offeset = (mainDigit - 2) * 3;
            int simbol = offeset + length - 1;
            int realSymbol = 97 + simbol;
            char c = (char)realSymbol;
            System.out.print(c);

        }

    }
}
