package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int facTotal = 0;
        int endnumber = number;
        while (number > 0) {
            int num = number % 10;
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            facTotal += factorial;
            number = number / 10;
        }
        if (facTotal == endnumber){
            System.out.println("yes");
        }else if (facTotal != endnumber){
            System.out.println("no");
        }
    }
}
