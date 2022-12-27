package ExercisesMethods;

import java.util.Scanner;

public class topNumber1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (devisibalBy8(i) && oddNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean devisibalBy8(int numb) {
        int results = 0;
        while (numb > 0) {
            int a = numb % 10;
            results += a;
            numb = numb / 10;
        }
        if (results % 8 == 0) {
            return true;
        }
        return false;
    }

    public static boolean oddNumber(int numb) {
        int results = 0;
        while (numb > 0) {
            int a = numb % 10;
            if (a % 2 != 0) {
                return true;
            }
            numb = numb / 10;
        }

        return false;

    }
}
