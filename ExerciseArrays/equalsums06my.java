package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalsums06my {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isValid = false;
        for (int i = 0; i <= numb.length - 1; i++) {
            int curentNumb = numb[i];

            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {     // лява сума
                leftSum += numb[j];
            }
            for (int k = i + 1; k <= numb.length - 1; k++) {      //дясна сума
                rightSum += numb[k];
            }
            if (leftSum == rightSum){
                System.out.print(i);
                isValid = true;
                break;
            }
        }
        if (!isValid){
            System.out.println("no");

        }


    }
}
