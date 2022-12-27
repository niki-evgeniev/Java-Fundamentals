package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> vagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.contains("end")) {
            if (command.contains("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                vagons.add(number);
            } else {
                int numberToAdd = Integer.parseInt(command.split(" ")[0]);
                for (int i = 0; i <= vagons.size() - 1; i++) {
                    int sum = vagons.get(i);
                    if (sum + numberToAdd <= maxPassengers) {
                        vagons.set(i, numberToAdd + sum);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int print : vagons) {
            System.out.print(print + " ");
        }
    }
}
