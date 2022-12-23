package DataTypesandVariables;

import java.util.Scanner;

public class LowerorUpper08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);

        if (a >= 'a' && a <= 'z') {
            System.out.println("lower-case");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("upper-case");
        }
    }
}
