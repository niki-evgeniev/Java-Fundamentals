package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.contains("Go Shopping!")) {
            String[] commands = input.split(" ");
            String command1 = commands[0];
            String command2 = commands[1];

            switch (command1) {
                case "Urgent":
                    if (!productList.contains(command2)){
                        productList.add(0, command2);
                    }
                    break;
                case "Unnecessary":
                    if (productList.contains(command2)){
                        int index = productList.indexOf(command2);
                        productList.remove(index);
                    }
                    break;
                case "Correct":
                    String command3 = commands[2];
                    // comands 2 = old
                    // comands 3 = new
                    if (productList.contains(command2)){
                        int index = productList.indexOf(command2);
                        productList.set(index,command3);
                    }
                    break;
                case "Rearrange":
                    if (productList.contains(command2)){
                        int index = productList.indexOf(command2);
                        String nameProductToMove = productList.get(index);
                        productList.remove(index);
                        productList.add(nameProductToMove);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", productList));
    }
}
