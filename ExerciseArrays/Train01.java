package ExerciseArrays;

import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.print(number + " ");
            total += number;
        }

        System.out.println();
        System.out.println(total);
    }
}
