package Methods;

import java.util.Scanner;

public class GreaterofTwoValues09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(biggestNumber(a, b));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(biggestString(firstString, secondString));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(biggestChar(firstChar, secondChar));
        }
    }

    public static int biggestNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String biggestString(String firstString, String secondString) {
        String results = "";
        if (firstString.compareTo(secondString) > 0) {
            results = firstString;
        } else {
            results = secondString;
        }
        return results;

    }

    public static char biggestChar(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
