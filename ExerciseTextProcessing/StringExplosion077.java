package ExerciseTextProcessing;

import java.util.Scanner;

public class StringExplosion077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int sum = 0;

        for (int i = 0; i <sb.length() ; i++) {
            if (sb.charAt(i) == '>'){
                int number = Integer.parseInt(sb.charAt(i + 1) + "");
                sum += number;
            }else if (sb.charAt(i)!= '>'&& sum > 0){
                sb.deleteCharAt(i);
                sum --;
                i --;
            }
        }

        System.out.println(sb);
    }
}
