package midExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command1 = input.split(" ")[0];
            int command2 = Integer.parseInt(input.split(" ")[1]);
            int command3 = Integer.parseInt(input.split(" ")[2]);

            switch (command1) {
                case "Shoot":
                    if (isValidIndex(targets, command2)) {
                        int getIndex = targets.get(command2);
                        int results = getIndex - command3;
                        if (results <= 0) {
                            targets.remove(command2);
                        } else if (results > 0) {
                            targets.set(command2, results);
                        }
                    }
                    break;
                case "Add":
                    if (isValidIndex(targets, command2)) {
                        targets.add(command2, command3);
                    } else if (!isValidIndex(targets, command2)) {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int range = 1 + (2 * command3);
                    //int command2 = command2;
                    int startToRemove = command2 + command3;
                    int endToRemove = command2 - command3;
                    if (!isValidIndexStrike(command2,command3, targets)) {
                        for (int i = startToRemove; i >= endToRemove; i--) {
                            targets.remove(i);
                        }
                    }
                    else if (isValidIndexStrike(command2,command3, targets)){
                        //System.out.println();
                        System.out.println("Strike missed!");
                        break;
                    }
                    break;
            }
            //System.out.println();
            input = scanner.nextLine();
        }


        List<String> resultList = new ArrayList<>();
        for (int target : targets) {
            resultList.add(String.valueOf(target));
        }
        System.out.println(String.join("|", resultList));

    }

    public static boolean isValidIndex(List<Integer> targets, int index) {
        if (index <= targets.size() - 1 && index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidIndexStrike(int index, int command3, List<Integer> targets) {
        if (index - command3 < 0 || index + command3 >= targets.size()) {
            return true;

        } else {
            return false;
        }
    }
}


