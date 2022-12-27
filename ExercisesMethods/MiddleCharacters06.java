package ExercisesMethods;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (text.length() % 2 == 0) {
            evenText(text);
        } else if (text.length() % 2 != 0) {
            oddText(text);
        }
    }

    public static void oddText(String text) {
        int middleChar = text.length() / 2;
        System.out.println(text.charAt(middleChar) + "");

    }

    public static void evenText(String text) {
        int middleChar = text.length() / 2;
        int middleCharSecond = text.length() / 2 - 1;
        System.out.println(text.charAt(middleCharSecond) + "" + text.charAt(middleChar));
    }
}
