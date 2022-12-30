package Methods;

import java.util.Scanner;

public class MultiplyEvensbyOdds01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        multipliesOfNumber(Math.abs(number));

    }

    public static void multipliesOfNumber(int number) {
        int sumEven = 0;
        int sumOdd = 0;

        while (number > 0) {
            int numb = number % 10;
            if (numb % 2 == 0) {
                sumEven += numb;
            } else {
                sumOdd += numb;
            }
            number = number / 10;
        }
        int results = sumEven * sumOdd;
        System.out.println(results);
    }
}
