package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String commands = scanner.nextLine();
            String[] command = commands.split(" ");
            String command1 = command[0];
            String username = command[1];

            switch (command1) {
                case "register":
                    String license = command[2];
                    if (parking.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", license);
                    } else {
                        parking.put(username, license);
                        System.out.printf("%s registered %s successfully%n", username, license);
                    }
                    break;
                case "unregister":
                    if (parking.containsKey(username)) {
                        System.out.printf("%s unregistered successfully%n", username);
                        parking.remove(username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
