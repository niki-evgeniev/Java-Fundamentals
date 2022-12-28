package finalExam;

import java.util.Scanner;

public class ActivationKeys01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        StringBuilder key = new StringBuilder(activationKey);
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] commands = input.split(">>>");
            String command = commands[0];
            int startIndex = 0;
            int endIndex = 0;

            switch (command) {
                case "Contains":
                    String substring = commands[1];
                    if (key.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", key, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upOrLow = commands[1];
                    startIndex = Integer.parseInt(commands[2]);
                    endIndex = Integer.parseInt(commands[3]);
                    String current = key.substring(startIndex, endIndex);
                    if (upOrLow.equals("Upper")) {
                        current = current.toUpperCase();
                        key.replace(startIndex, endIndex, current);
                        System.out.println(key);
                    } else if (upOrLow.equals("Lower")) {
                        current = current.toLowerCase();
                        key.replace(startIndex, endIndex, current);
                        System.out.println(key);
                    }
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(commands[1]);
                    endIndex = Integer.parseInt(commands[2]);
                    key.delete(startIndex, endIndex);
                    System.out.println(key);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", key);

    }
}
