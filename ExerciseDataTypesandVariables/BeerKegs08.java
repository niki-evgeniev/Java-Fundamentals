package ExerciseDataTypesandVariables;

import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double status = Double.MIN_VALUE;
        String nameBig = "";

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double results = Math.PI * Math.pow(radius, 2) * height;

            if (results > status) {
                status = results;
                nameBig = name;
            }
        }
        System.out.println(nameBig);
    }
}
