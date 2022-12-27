package ExercisesMethods;

import java.util.Scanner;

public class CharactersinRange03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        printChar(a, b);
    }

    public static void printChar(char a, char b) {
        if (a > b) {
            char c = 'a';
            c = a;
            a = b;
            b = c;
        }
        for (int i = a; i <= b; i++) {
            if (i == a || i == b) {

            } else {
                System.out.printf("%c ", i);
            }
        }
    }
}
