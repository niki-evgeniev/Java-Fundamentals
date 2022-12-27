package ExerciseDataTypesandVariables;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int tank = 255;

        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (litters > tank) {
                System.out.println("Insufficient capacity!");
            } else {
                tank -= litters;
            }
        }

        int total = 255 - tank;
        System.out.println(total);

    }
}
