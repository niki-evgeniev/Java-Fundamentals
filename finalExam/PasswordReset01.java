package finalExam;


import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordReset01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(password);


        while (!input.equals("Done")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            String newPassword = "";
            if (command.equals("TakeOdd")) {
                for (int i = 1; i <= sb.length() - 1; i = i + 2) {
                    newPassword += String.valueOf(sb.charAt(i));
                }
                sb = new StringBuilder(newPassword);
                System.out.println(sb);
            } else if (command.equals("Cut")) {
                //Cut 15 3
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = startIndex + Integer.parseInt(commands[2]);
                sb.replace(startIndex, endIndex, "");
                System.out.println(sb);

            } else if (command.equals("Substitute")) {
                String currentSymbol = commands[1];
                String toReplece = commands[2];
                String newpass = "";
                String newBiulder = String.valueOf(sb);
                if (newBiulder.contains(currentSymbol)) {
                    newBiulder = newBiulder.replace(currentSymbol, toReplece);
                    sb = new StringBuilder(newBiulder);
                    System.out.println(sb);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", sb);
    }
}
