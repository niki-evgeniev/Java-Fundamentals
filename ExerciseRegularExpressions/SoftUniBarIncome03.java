package ExerciseRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>[A-Z][a-z]*[0-9]*)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$";

        Pattern pattern = Pattern.compile(regex);
        double sumTotal = 0;


        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double sum = Double.parseDouble(matcher.group("price"));
                double currentSum = sum * count;
                sumTotal += currentSum;
                System.out.printf("%s: %s - %.2f%n", name, product, currentSum);
            }


            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sumTotal);
    }
}
