package List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Double sum = 0.00;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                sum = numbers.get(i) + numbers.get(i + 1);
                Double sumNumbers = numbers.get(i) + numbers.get(i + 1);
                numbers.remove(i + 1);
                numbers.set(i, sumNumbers);
                i = -1;
            }
        }

        DecimalFormat decimal = new DecimalFormat("0.##");
        for (double number :
                numbers) {
            System.out.print(decimal.format(number) + " ");
        }
    }
}
