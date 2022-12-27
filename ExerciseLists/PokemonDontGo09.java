package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemon = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;

        while (!pokemon.isEmpty()) {
            int number = Integer.parseInt(scanner.nextLine());
            int indexNumber = pokemon.get(number);
            sum += indexNumber;
            pokemon.remove(number);
            int lastElement = pokemon.size() - 1;
            if (indexNumber < 0) {
                int firstElement = pokemon.get(0);
                pokemon.remove(0);
                pokemon.add(0, lastElement);
                List(indexNumber, pokemon);
            } else if (indexNumber > pokemon.size() - 1) {
                int firstElement = pokemon.get(0);
                pokemon.remove(pokemon.size() - 1);
                pokemon.add(pokemon.size() - 1, firstElement);
                List(indexNumber, pokemon);
            }
        }

        System.out.println(sum);


    }

    public static void List(int indexNumber, List<Integer> pokemon) {
        for (int i = 0; i < pokemon.size(); i++) {
            int index = pokemon.get(i);
            if (index <= indexNumber) {
                index += indexNumber;
                pokemon.set(i, index);
            } else if (index > indexNumber) {
                index -= indexNumber;
                pokemon.set(i, index);
            }
        }
    }
}
