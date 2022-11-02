package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> mapChest = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int coin = Integer.parseInt(scanner.nextLine());
            if (!mapChest.containsKey(input)){
                mapChest.put(input,coin);
            }else {
                mapChest.get(input);
                int count = mapChest.get(input);
                mapChest.put(input, count + coin);

            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mapChest.entrySet()) {
            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }


    }
}
