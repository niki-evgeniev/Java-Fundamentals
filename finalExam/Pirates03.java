package finalExam;

import java.util.*;

public class Pirates03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Integer>> mapCity = new LinkedHashMap<>();

        while (!input.equals("Sail")) {
            String[] inputMap = input.split("\\|\\|");


            if (mapCity.containsKey(inputMap[0])) {
                int population = Integer.parseInt(inputMap[1]);
                int gold = Integer.parseInt(inputMap[2]);
                int totalPopulation = population + mapCity.get(inputMap[0]).get(0);
                int totalGold = gold + mapCity.get(inputMap[0]).get(1);
                mapCity.get(inputMap[0]).set(0, totalPopulation);
                mapCity.get(inputMap[0]).set(1, totalGold);
            } else {
                mapCity.put(inputMap[0], new ArrayList<>());
                mapCity.get(inputMap[0]).add(Integer.parseInt(inputMap[1]));
                mapCity.get(inputMap[0]).add(Integer.parseInt(inputMap[2]));
            }
            input = scanner.nextLine();
        }
        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            String[] command = commands.split("=>");
            String city = command[1];
            int people = 0;
            int gold = 0;
            switch (command[0]) {
                case "Plunder":
                    city = command[1];
                    people = Integer.parseInt(command[2]);
                    gold = Integer.parseInt(command[3]);
                    int peopleKill = mapCity.get(city).get(0) - people;
                    int goldStolen = mapCity.get(city).get(1) - gold;
                    if (peopleKill < 0 || goldStolen < 0) {
                        mapCity.remove(city);
                        System.out.printf("%s has been wiped off the map!%n", city);
                    } else {
                        mapCity.get(city).set(0, peopleKill);
                        mapCity.get(city).set(1, goldStolen);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);
                        if (peopleKill <= 0 || goldStolen <= 0) {
                            mapCity.remove(city);
                            System.out.printf("%s has been wiped off the map!%n", city);
                        }
                    }
                    break;
                case "Prosper":
                    city = command[1];
                    gold = Integer.parseInt(command[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int goldToAdd = mapCity.get(city).get(1) + gold;
                        mapCity.get(city).set(1, goldToAdd);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, goldToAdd);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        if (!mapCity.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", mapCity.size());
            for (Map.Entry<String, List<Integer>> entry : mapCity.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
