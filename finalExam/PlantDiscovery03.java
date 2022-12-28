package finalExam;

import java.util.*;

public class PlantDiscovery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> movieMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] readConsole = scanner.nextLine().split("<->");
            if (movieMap.containsKey(readConsole[0])) {
                movieMap.get(readConsole[0]).set(0, Double.parseDouble(readConsole[1]));
            } else {
                movieMap.put(readConsole[0], new ArrayList<>());
                movieMap.get(readConsole[0]).add(Double.parseDouble(readConsole[1]));
            }
        }

        String commands = scanner.nextLine();
        while (!commands.equals("Exhibition")) {
            String[] command = commands.split(": ");
            String[] commandToUse = command[1].split(" - ");
            switch (command[0]) {
                case "Rate":
                    double rateNumber = Double.parseDouble(commandToUse[1]);
                    movieMap.get(commandToUse[0]).add(rateNumber);
                    break;
                case "Update":
                    movieMap.get(commandToUse[0]).set(0, Double.parseDouble(commandToUse[1]));
                    break;
                case "Reset":
                    movieMap.get(commandToUse[0]).set(0, 0.00);
                    break;
            }
            commands = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, List<Double>> entry : movieMap.entrySet()) {
            int sadjn = entry.getValue().size();
            double rate = 0;
            for (int i = 1; i < entry.getValue().size(); i++) {
                rate += entry.getValue().get(i);
            }
            rate = rate / (sadjn - 1);
            System.out.printf("%s; Rarity: %.0f; Rating: %.2f%n", entry.getKey(), entry.getValue().get(0), rate);
        }
    }
}
