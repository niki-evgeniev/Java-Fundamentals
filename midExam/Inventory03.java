package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> journal = Arrays.stream(scanner.nextLine().split("\\, ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.contains("Craft!")) {
            String[] commands = command.split("\\ \\-\\ ");
            String command1 = commands[0];
            String command2 = commands[1];

            switch (command1) {
                case "Collect":
                    if (!journal.contains(command2)) {
                        journal.add(command2);
                    }
                    break;
                case "Drop":
                    if (journal.contains(command2)) {
                        int index = journal.indexOf(command2);
                        journal.remove(index);
                    }
                    break;
                case"Combine Items":
                    String [] newOldItem = command2.split(":");
                    String oldItem = newOldItem[0];
                    String newItem = newOldItem[1];
                    if (journal.contains(oldItem)){
                        int index = journal.indexOf(oldItem);
                        journal.add(index +1, newItem);
                    }
                    break;
                case "Renew":
                    if (journal.contains(command2)){
                        int index = journal.indexOf(command2);
                        String element = journal.get(index);
                        journal.remove(command2);
                        journal.add(element);
                    }
                    break;
            }
                command = scanner.nextLine();
        }
        System.out.println(String.join(", ", journal));
    }
}
