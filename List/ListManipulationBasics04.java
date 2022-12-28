package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandLine = command.split(" ");
            if (commandLine[0].equals("Add")) {
                int number = Integer.parseInt(commandLine[1]);
                numbers.add(number);
            } else if (commandLine[0].equals("Remove")) {
                int number = Integer.parseInt(commandLine[1]);
                numbers.remove(Integer.valueOf(number));
            } else if (commandLine[0].equals("RemoveAt")) {
                int number = Integer.parseInt(commandLine[1]);
                numbers.remove(number);
            } else if (commandLine[0].equals("Insert")) {
                int number = Integer.parseInt(commandLine[1]);
                int index = Integer.parseInt(commandLine[2]);
                numbers.add(index, number);
            }

            command = scanner.nextLine();
        }

        for (int num :
                numbers) {
            System.out.print(num + " ");
        }
    }
}
