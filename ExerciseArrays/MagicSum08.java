package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int results = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numb.length - 1; i++) {
            int currentNumber = numb[i];
            for (int j = i + 1; j <= numb.length - 1; j++) {
                int currentNumber2 = currentNumber + numb[j];
                if (currentNumber2 == results){
                    System.out.println(currentNumber + " " + numb[j]);
                }
            }
        }
    }
}
