package ExercisesMethods;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!pwBetween6and10Characters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyLetterDigit(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!least2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (pwBetween6and10Characters(password) && onlyLetterDigit(password) && least2Digits(password)) {
            System.out.println("Password is valid");
        }


    }

    public static boolean pwBetween6and10Characters(String text) {
        boolean isValid = false;
        if (text.length() >= 6 && text.length() <= 10) {
            isValid = true;
            return true;
        } else {

            return false;
        }
    }

    public static boolean onlyLetterDigit(String text) {
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }

        }
        return true;
    }

    public static boolean least2Digits(String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }

        return false;
    }
}
