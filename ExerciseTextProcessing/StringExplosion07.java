package ExerciseTextProcessing;

import java.util.Scanner;

public class StringExplosion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int sum = 0;

        for (int i = 0; i <sb.length() - 1; i++) {
            if (sb.charAt(i) == '>'){
                sum = sb.charAt(i + 1);
                sb.deleteCharAt(i +1);
            }
        }
        System.out.println();
    }
}
