package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstCards = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondCards = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstCards.size() != 0 && secondCards.size() != 0) {
            int firstCard = firstCards.get(0);
            int secondCard = secondCards.get(0);
            firstCards.remove(0);
            secondCards.remove(0);

            if (firstCard > secondCard) {
                firstCards.add(firstCard);
                firstCards.add(secondCard);
            } else if (secondCard > firstCard) {
                secondCards.add(secondCard);
                secondCards.add(firstCard);
            }
        }

        if (firstCards.size() == 0) {
            int sum = 0;
            for (int sumCard : secondCards) {
                sum += sumCard;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else if (secondCards.size() == 0) {
            int sum = 0;
            for (int sumCard :
                    firstCards) {
                sum += sumCard;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
