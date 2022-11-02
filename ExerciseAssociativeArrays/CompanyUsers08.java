package ExerciseAssociativeArrays;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> academy = new LinkedHashMap<>();

        while (!input.equals("End")){
            String[] commands = input.split(" -> ");
            String name = commands[0];
            String id = commands[1];
            if (!academy.containsKey(name)){
                academy.put(name, new ArrayList<>());
                academy.get(name).add(id);
            }else if (academy.containsKey(name)){
                if (academy.get(name).contains(id)){
                    input = scanner.nextLine();
                    continue;
                }else {
                    academy.get(name).add(id);
                }
            }
            input = scanner.nextLine();
        }
        //System.out.println();
        for (Map.Entry<String, List<String>> entry : academy.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }

    }
}
