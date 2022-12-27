package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bombastically = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String bomb = scanner.nextLine();
        int bombNum = Integer.parseInt(bomb.split(" ")[0]);
        int bombPower = Integer.parseInt(bomb.split(" ")[1]);

        while (bombastically.contains(bombNum)) {
            int elements = bombastically.indexOf(bombNum);
            int indexLeft = Math.max(0, elements - bombPower);
            int indexRight = Math.min(elements + bombPower, bombastically.size() - 1);
            for (int index = indexRight; index >= indexLeft; index--) {
                bombastically.remove(index);
            }

        }
        int sum = 0;
        for (int number :
                bombastically) {
            sum = sum + number;

        }
        System.out.println(sum);
    }
}

