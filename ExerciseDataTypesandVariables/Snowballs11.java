package ExerciseDataTypesandVariables;

import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double value = Double.MIN_VALUE;
        int snowBig = 0;
        int timeMax = 0;
        int qualityBig = 0;
        for (int i = 1; i <= n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            //(snowballSnow / snowballTime) ^ snowballQuality
            double results = Math.pow((snow / time), quality);
            if (results > value) {
                value = results;
                snowBig = snow;
                timeMax = time;
                qualityBig = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowBig, timeMax, value, qualityBig);
    }
}
