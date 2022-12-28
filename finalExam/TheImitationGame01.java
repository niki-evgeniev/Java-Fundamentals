package finalExam;

import java.util.Scanner;

public class TheImitationGame01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codingMasseges = scanner.nextLine();
        StringBuilder sb = new StringBuilder(codingMasseges);

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] command = input.split("\\|");
            switch (command[0]) {
                case "Move":
                    int n = Integer.parseInt(command[1]);
                    if (n <= sb.length() && n > 0) {
                        String wordToMove = sb.substring(0, n);
                        sb.delete(0, n);
                        sb.append(wordToMove);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index <= sb.length()) {
                        String value = command[2];
                        sb.insert(index, value);
                    }
                    break;
                case "ChangeAll":
                    String changeAll = sb.toString();
                    changeAll = changeAll.replace(command[1], command[2]);
                    sb = new StringBuilder(changeAll);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + sb);
    }
}
