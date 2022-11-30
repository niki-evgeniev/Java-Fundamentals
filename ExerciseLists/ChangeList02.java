package ExerciseLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> List = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.contains("end")){
            if (commands.contains("Delete")){
                int elementDelete = Integer.parseInt(commands.split(" ")[1]);
                List.removeAll(Collections.singleton(elementDelete));
            }else if (commands.contains("Insert")){
                int elementInsert = Integer.parseInt(commands.split(" ")[1]);
                int position = Integer.parseInt(commands.split(" ")[2]);
                List.add(position, elementInsert);
            }
            commands = scanner.nextLine();
        }

        for (int number : List ) {
            System.out.print(number + " ");
        }
    }
}
