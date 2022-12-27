package ExercisesMethods;

import java.util.Scanner;

public class NxNMatrix07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            printXN(n);
            System.out.println();
        }
    }

    public static void printXN(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(n + " ");
        }
    }
}
