package ExerciseDataTypesandVariables;

import java.util.Scanner;

public class PrintPartoftheASCIITable05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            char symbol = (char) i;
            System.out.printf("%c ", symbol);
        }
    }
}
