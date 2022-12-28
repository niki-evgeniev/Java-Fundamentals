package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String command1 = commands[0];
            String command2 = commands[1];
            switch (command1) {
                case "Contains":
                    int number = Integer.parseInt(command2);
                    if (firstList.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command2.equals("even")) {
                        for (int eventNumber : firstList) {
                            if (eventNumber % 2 == 0) {
                                System.out.print(eventNumber + " ");
                            }
                        }
                        System.out.println();
                    } else if (command2.equals("odd")) {
                        for (int oddNumber : firstList) {
                            if (oddNumber % 2 != 0) {
                                System.out.print(oddNumber + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sumAllNumber = 0;
                    for (int sumNum : firstList) {
                        sumAllNumber += sumNum;
                    }
                    System.out.println(sumAllNumber);
                    break;
                case "Filter":
                    int numberForCalculate = Integer.parseInt(commands[2]);
                    if (command2.equals("<")) {
                        for (int i = 0; i <= firstList.size() - 1; i++) {
                            if (numberForCalculate <= firstList.get(i)) {

                            } else {
                                System.out.print(firstList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (command2.equals(">")) {
                        for (int i = 0; i <= firstList.size() - 1; i++) {
                            if (numberForCalculate >= firstList.get(i)) {

                            } else {
                                System.out.print(firstList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (command2.equals(">=")) {
                        for (int i = 0; i <= firstList.size() - 1; i++) {
                            if (numberForCalculate > firstList.get(i)) {

                            } else {
                                System.out.print(firstList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (command2.equals("<=")) {
                        for (int i = 0; i <= firstList.size() - 1; i++) {
                            if (numberForCalculate < firstList.get(i)) {

                            } else {
                                System.out.print(firstList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
