package ExerciseArrays;

import java.util.Scanner;

public class TreasureHunt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasure = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandConsole = command.split(" ");
            String commandSwitch = commandConsole[0];
            switch (commandSwitch) {
                case "Loot":
                    for (int i = 1; i <= commandConsole.length - 1; i++) {
                        for (int j = 0; j <= treasure.length - 1; j++) {
                            if (treasure[i].equals(commandConsole[j + 1])) {
                                break;
                            } else {
                                String newChest = commandConsole[i] + " " + String.join(" ", treasure);
                                treasure = newChest.split(" ");
                                break;
                            }
                        }
                    }
                    break;
                case "Drop":
                    break;
                case "Steal":
            }
            command = scanner.nextLine();
        }
        treasure[0] = "";
    }
}
