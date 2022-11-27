package ExerciseLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> virus = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.contains("3:1")) {
            if (commands.contains("merge")) {
                int startIndex = Integer.parseInt(commands.split(" ")[1]);
                int endIndex = Integer.parseInt(commands.split(" ")[2]);
                String merge = "";
                if (endIndex > virus.size() - 1) {
                    endIndex = virus.size() - 1;
                }
                if (startIndex < 0){
                    startIndex = 0;
                }

                if (isInRange(endIndex, startIndex, virus.size() -1)) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        merge += virus.get(i);
                    }
                }
                // премахване на индекси
                if (isInRange(endIndex, startIndex, virus.size() - 1)) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        virus.remove(startIndex);
                    }
                    virus.add(startIndex, merge);
                }
            } else if (commands.contains("divide")) {
                int index = Integer.parseInt(commands.split(" ")[1]);
                int partitions = Integer.parseInt(commands.split(" ")[2]);
                String toDivide = virus.get(index);
                int sizeIndex = toDivide.length() / partitions;
                int startWord = 0;
                virus.remove(index);
                for (int i = 1; i < partitions; i++) {
                    String endDivide = toDivide.substring(startWord, startWord + sizeIndex);
                   // System.out.println(endDivide);
                    startWord += sizeIndex;
                    virus.add(index,endDivide);
                    index++;
                   // if (i <= )
                }
                virus.add(index,toDivide.substring(startWord));
            }


            commands = scanner.nextLine();
        }
        for (String word : virus) {
            System.out.print(word + " ");
        }

    }

    public static boolean isInRange(int endIndex, int startIndex, int listSize) {
        if (startIndex <=  listSize  && endIndex >= 0 && startIndex < endIndex) {
            return true;
        } else {
            return false;
        }

    }
}
