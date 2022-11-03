package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> letter = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == ' ') {
                continue;
            }
            if (!letter.containsKey(symbol)){
                letter.put(symbol, 1);
            }else {
                int count = letter.get(symbol);
                letter.put(symbol, count + 1);
            }

           //System.out.println();
        }
        for (Map.Entry<Character, Integer> entry : letter.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }


}

