package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numAdd);
            } else if (command.contains("Insert")) {
                int numAdd = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (isValidIndex(index, numbers.size())) {
                    numbers.add(index, numAdd);
                }

            } else if (command.contains("Remove")) {
                int indexRemove = Integer.parseInt(command.split(" ")[1]);
                if (isValidIndex(indexRemove, numbers.size())) {
                    numbers.remove(indexRemove);
                }
            } else if (command.contains("Shift left")) {
                //•	Shift left {count} - first number becomes last 'count' times
                int leftCount = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= leftCount; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.add(firstNumber);
                    numbers.remove(0);
                }
            } else if (command.contains("Shift right")) {
                //•	Shift right {count} - last number becomes first 'count' times
                int rightCount = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= rightCount; i++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                    numbers.remove(numbers.size() - 1);
                }
            }


            command = scanner.nextLine();

        }
        for (int number :
                numbers) {
            System.out.print(number + " ");


        }
    }

    public static boolean isValidIndex(int index, int sizeOflist) {
        if (index >= 0 && index <= sizeOflist - 1) {
            return true;
        } else {
            System.out.println("Invalid index");
            return false;
        }
    }
}
