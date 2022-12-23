package DataTypesandVariables;

import java.util.Scanner;

public class ConvertMeterstoKilometers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int metters = Integer.parseInt(scanner.nextLine());
        double totalKm = metters / 1000.0;
        System.out.printf("%.2f",totalKm);
    }
}
