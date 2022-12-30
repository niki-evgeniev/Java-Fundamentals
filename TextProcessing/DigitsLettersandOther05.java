package TextProcessing;

import java.util.Scanner;

public class DigitsLettersandOther05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder older = new StringBuilder();

        char[] symbol = input.toCharArray();

        for (char symbolTo : symbol) {
            if (Character.isLetter(symbolTo)) {
                letter.append(symbolTo);
            } else if (Character.isDigit(symbolTo)) {
                digit.append(symbolTo);
            } else {
                older.append(symbolTo);
            }
        }

        System.out.println(digit);
        System.out.println(letter);
        System.out.println(older);
    }
}
