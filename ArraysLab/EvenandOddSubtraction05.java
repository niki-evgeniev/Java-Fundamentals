package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int odd = 0;
        int even = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even += number[i];
            } else {
                odd += number[i];
            }
        }
        System.out.println(even - odd);
    }
}
