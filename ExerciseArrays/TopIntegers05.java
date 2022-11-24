package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();


        for (int i = 0; i <= numb.length - 1; i++) {
            int currentNumb = numb[i];
            if (i == numb.length - 1){
                System.out.println(currentNumb);
                continue;
            }
            boolean isBig = false;

            for (int j = i + 1; j <= numb.length - 1; j++) {
                if (currentNumb > numb[j]) {
                    isBig = true;
                } else {
                    isBig = false;
                    break;
                }

            }
            if (isBig) {
                System.out.print(currentNumb + " ");
            }
        }
    }
}



