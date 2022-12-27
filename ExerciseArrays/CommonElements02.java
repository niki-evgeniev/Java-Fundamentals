package ExerciseArrays;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String secondEl : secondArr) {
            for (String firstEl : firstArr) {
                if (firstEl.equals(secondEl)) {
                    System.out.print(secondEl + " ");
                }
            }
        }
    }
}
