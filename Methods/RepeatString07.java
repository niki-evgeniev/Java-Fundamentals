package Methods;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String repeat = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        repeatString(repeat, n);
    }

    public static void repeatString(String repeat, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(repeat);
        }
    }
}
