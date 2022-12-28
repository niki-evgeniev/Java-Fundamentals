package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double degree = Double.parseDouble(scanner.nextLine());
        double results = degreeCalculate(number, degree);

        DecimalFormat decimal = new DecimalFormat("0.####");
        System.out.println(decimal.format(results));

    }

    public static double degreeCalculate(double number, double degree) {
        double results = 1;
        for (int i = 1; i <= degree; i++) {
            results = results * number;
        }
        return results;
    }
}
