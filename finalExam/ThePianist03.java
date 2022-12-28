package finalExam;

import java.util.*;

public class ThePianist03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> musicMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            musicMap.put(input[0], new ArrayList<>());
            musicMap.get(input[0]).add(input[1]);
            musicMap.get(input[0]).add(input[2]);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            String[] command = commands.split("\\|");
            String commandToUse = command[0];
            String piece = command[1];
            switch (commandToUse) {
                case "Add":
                    String composer = command[2];
                    String key = command[3];
                    if (musicMap.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        musicMap.put(piece, new ArrayList<>());
                        musicMap.get(piece).add(composer);
                        musicMap.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (musicMap.containsKey(piece)) {
                        musicMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    if (musicMap.containsKey(piece)) {
                        String newKey = command[2];
                        String currentComposer = musicMap.get(piece).get(0);
                        String currentKey = musicMap.get(piece).get(1);
                        musicMap.get(piece).remove(1);
                        musicMap.get(piece).add(1, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
            }
            commands = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : musicMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Composer: " + entry.getValue().get(0) + ", Key: " + entry.getValue().get(1));
        }
    }
}
