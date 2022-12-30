package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Memorygame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;
        boolean isEmpty = false;

        while (!input.contains("end")) {
            String[] commands = input.split(" ");
            int command1 = Integer.parseInt(commands[0]);
            int command2 = Integer.parseInt(commands[1]);
            count++;
            if (command1 >= 0 && command1 <= lessons.size() - 1 && command2 >= 0 && command2 <= lessons.size() - 1 && command2 != command1) {
//                int firstNum = Integer.parseInt(lessons.get(command1));
//                int secondNum = Integer.parseInt(lessons.get(command2));
                String firstNum = lessons.get(command1);
                String secondNum = lessons.get(command2);
                if (firstNum.equals(secondNum)) {
                    if (command1 > command2) {
                        lessons.remove(command1);
                        lessons.remove(command2);
                    }else if (command2 > command1){
                        lessons.remove(command2);
                        lessons.remove(command1);
                    }
                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstNum);
                } else {
                    System.out.println("Try again!");
                }

            } else {
                int sizeList = lessons.size() / 2;
                String element = "-" + count + "a";
                lessons.add(sizeList, element);
                lessons.add(sizeList + 1, element);
                System.out.println("Invalid input! Adding additional elements to the board");

            }
            if (lessons.isEmpty()) {
                isEmpty = true;
                System.out.printf("You have won in %d turns!", count);
                break;
            }

            input = scanner.nextLine();
        }
        if (!isEmpty) {
            System.out.println("Sorry you lose :(");
            for (String element : lessons) {
                System.out.print(element + " ");
            }
        }
    }
}
