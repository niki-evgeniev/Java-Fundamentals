package ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<name>[A-Za-z0-9]+)<<(?<price>[0-9].*[0-9])!(?<quantity>[0-9]+)";

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        double totalSum = 0;
        List<String> names = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String nameFur = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quan = Integer.parseInt(matcher.group("quantity"));
                totalSum += price * quan;
                names.add(nameFur);
            }

            input = scanner.next();
        }

        System.out.println("Bought furniture:");
        for (String namess : names) {
            System.out.println(namess);
        }

        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
