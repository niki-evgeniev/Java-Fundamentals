package ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> listPeople = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];

            if (command.contains("is going")) {
                if (listPeople.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else if (!listPeople.contains(name)) {
                    listPeople.add(name);
                }
            } else if (command.contains("is not going")) {
                if (listPeople.contains(name)) {
                    listPeople.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (String people :
                listPeople) {
            System.out.println(people);
        }
    }
}
