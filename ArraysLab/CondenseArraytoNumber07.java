package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        int sum2 = 0;
        if (numb.length == 1) {
            int cas = numb[0];
            System.out.println(cas);
        }
        boolean isValid = false;
        while (numb.length > 1) {
            isValid = true;
            int[] sec = new int[numb.length - 1];
            for (int i = 0; i < numb.length - 1; i++) {
                sum2 = numb[i] + numb[i + 1];
                sum += sum2;
                sec[i] = sum2;
            }
            numb = sec;
        }if (isValid) {
            System.out.println(sum2);
        }
    }
}


