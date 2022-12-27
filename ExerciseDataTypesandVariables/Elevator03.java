package ExerciseDataTypesandVariables;

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int person = Integer.parseInt(scanner.nextLine());

        double a = Math.ceil(n * 1.0 / person);
        System.out.printf("%.0f", a);

    }
}
