package ExerciseTextProcessing;

import java.util.Scanner;

public class ValidUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(", ");

        for (String username : words) {
            if (validUserName(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean validUserName(String username) {
        if (username.length() < 3 || username.length() > 16){
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol !='-' && symbol != '_' ){
                return false;
            }
        }
        return true;
    }
}
