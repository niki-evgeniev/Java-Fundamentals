package ExerciseTextProcessing;

import java.util.Scanner;

public class CaesarCipher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] textToEncrypt = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char symbol : textToEncrypt) {
            char newCharCrypt = (char) (symbol + 3);
            sb.append(newCharCrypt);
        }

        System.out.println(sb);
    }
}
