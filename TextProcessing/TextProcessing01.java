package TextProcessing;

import java.util.Scanner;

public class TextProcessing01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            System.out.println(input + " = " + sb);
            input = scanner.nextLine();
        }
    }
}
