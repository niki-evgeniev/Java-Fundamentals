package finalExam;

import java.util.Scanner;

public class WorldTour01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        StringBuilder cityBuilder = new StringBuilder(city);
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] command = input.split(":");
            switch (command[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(command[1]);
                    String currentCity = command[2];
                    if (index >= 0 && index <= cityBuilder.length() - 1) {
                        cityBuilder.insert(index, currentCity);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if (startIndex >= 0 && startIndex <= cityBuilder.length() - 1 && endIndex >= 0 && endIndex <= cityBuilder.length() - 1) {
                        cityBuilder.delete(startIndex, endIndex + 1);
                    }
                    break;
                case "Switch":
                    String oldStop = command[1];
                    String newStop = command[2];
                    String newBilder = String.valueOf(cityBuilder);
                    if (newBilder.contains(oldStop)) {
                        newBilder = newBilder.replace(oldStop, newStop);
                        cityBuilder = new StringBuilder(newBilder);
                    }
                    break;
            }
            System.out.println(cityBuilder);

            input = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + cityBuilder);
    }
}
