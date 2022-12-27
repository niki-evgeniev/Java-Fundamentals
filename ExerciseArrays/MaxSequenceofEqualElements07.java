package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numb = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int number = 1;
        int countNumber = 0;
        int index = 0;
        int indexTop = 0;

        for (int i = 1; i <= numb.length - 1; i++) {
            if (numb[i] == numb[i - 1]) {
                number++;
            } else {
                number = 1;
                index = i;
            }
            if (number > countNumber) {
                countNumber = number;
                indexTop = index;
            }
        }

        for (int i = indexTop; i < indexTop + countNumber; i++) {
            System.out.print(numb[i] + " ");

        }
    }
}
