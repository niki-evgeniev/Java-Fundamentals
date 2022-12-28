package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> finalList = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i <= firstList.size() - 1; i++) {
                int firstElement = firstList.get(i);

                finalList.add(firstElement);
                if (secondList.size() - 1 < i) {

                } else {
                    int secondElement = secondList.get(i);
                    finalList.add(secondElement);
                }
            }
        } else {
            for (int i = 0; i <= secondList.size() - 1; i++) {
                if (firstList.size() - 1 < i) {

                } else {
                    int firstElement = firstList.get(i);
                    finalList.add(firstElement);
                }
                int secondElement = secondList.get(i);
                finalList.add(secondElement);
            }

        }

        for (int number : finalList) {
            System.out.print(number + " ");
        }
    }
}
