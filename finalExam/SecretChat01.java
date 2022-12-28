package finalExam;

import java.util.Scanner;

public class SecretChat01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretMesseges = scanner.nextLine();
        StringBuilder sb = new StringBuilder(secretMesseges);
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] command = input.split(":\\|:");
            switch (command[0]) {
                case "InsertSpace":
                    int indexInser = Integer.parseInt(command[1]);
                    sb.insert(indexInser, " ");
                    System.out.println(sb);
                    break;
                case "Reverse":
                    String checkWord = String.valueOf(sb);
                    String wordToReplece = command[1];
                    if (checkWord.contains(wordToReplece)) {
                        int firstIndex = sb.indexOf(command[1]);
                        sb.delete(firstIndex, firstIndex + command[1].length());
                        StringBuilder sbRevers = new StringBuilder(command[1]);
                        sbRevers = sbRevers.reverse();
                        String revers = String.valueOf(sbRevers);
                        String repleaceWord = sb.toString();
                        sb.append(revers);
                        System.out.println(sb);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String repleaceAll = sb.toString();
                    repleaceAll = repleaceAll.replaceAll(command[1], command[2]);
                    sb = new StringBuilder(repleaceAll);
                    System.out.println(sb);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + sb);
    }
}
