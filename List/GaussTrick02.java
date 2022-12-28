package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        int numbSize = numbers.size();

        for (int i = 0; i < numbSize / 2; i++) {
            int firstSum = numbers.get(i);
            int secondSum = numbers.get(numbers.size() - 1);
            sum = firstSum + secondSum;
            numbers.remove(numbers.size() - 1);
            numbers.set(i, sum);
        }

        for (int numb : numbers) {
            System.out.print(numb + " ");

        }
    }
}
