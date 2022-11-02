package DataTypesandVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int ch = 1; ch <= n; ch++) {
            int number = ch;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (sum == 5|| sum == 7 || sum == 11){
                System.out.printf("%d -> True%n",ch);
            }else{
                System.out.printf("%d -> False%n",ch);
            }
            sum = 0;
        }
    }
}