package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemon = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        while (!pokemon.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                int firstElement = pokemon.get(0);
                int lastElement = pokemon.get(pokemon.size() - 1);
                pokemon.remove(0);
                pokemon.add(0, lastElement);
                sum += firstElement;
                calculateList(firstElement, pokemon);
            } else if (index > pokemon.size() - 1) {
                int firstElement = pokemon.get(0);
                int lastElement = pokemon.get(pokemon.size() - 1);
                pokemon.remove(pokemon.size() - 1);
                pokemon.add(pokemon.size(), firstElement);
                sum += lastElement;
                calculateList(lastElement, pokemon);
            } else {
                int elementToDelete = pokemon.get(index);
                sum += elementToDelete;
                pokemon.remove(index);
                calculateList(elementToDelete, pokemon);
            }
        }

        System.out.println(sum);

    }

    public static void calculateList(int elementToDel, List<Integer> pokemon) {
        for (int i = 0; i <= pokemon.size() - 1; i++) {
            if (elementToDel >= pokemon.get(i)) {
                int element = pokemon.get(i);
                element += elementToDel;
                pokemon.set(i, element);
            } else if (elementToDel < pokemon.get(i)) {
                int element = pokemon.get(i);
                element -= elementToDel;
                pokemon.set(i, element);
            }
        }

    }
}
