package ExerciseArrays;

import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n; i++) {
            String numbers = scanner.nextLine();
            int firstNum = Integer.parseInt(numbers.split(" ")[0]);
            int secondNum = Integer.parseInt(numbers.split(" ")[1]);
            if (i % 2 == 0) {
                firstArr[i - 1] = secondNum;
                secondArr[i - 1] = firstNum;
            } else {
                firstArr[i - 1] = firstNum;
                secondArr[i - 1] = secondNum;
            }
        }
        for (int num : firstArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num2 : secondArr) {
            System.out.print(num2 + " ");
        }

    }
}

