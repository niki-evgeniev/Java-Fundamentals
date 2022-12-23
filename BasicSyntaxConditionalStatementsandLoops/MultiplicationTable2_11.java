package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number2; i <= 10; i++) {
            int sum = number * i;
            System.out.printf("%d X %d = %d%n", number, i, sum);
        }

        if (number2 > 10) {
            int sum2 = number2 * number;
            System.out.printf("%d X %d = %d", number, number2, sum2);
        }
    }
}
