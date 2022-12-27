package ExerciseArrays;

import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        String saveFirstNum = " ";

        for (int i = 1; i <= rotations; i++) {
            saveFirstNum = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
            arr[arr.length - 1] = saveFirstNum;
        }

        for (String number : arr) {
            System.out.print(number + " ");
        }
    }
}
