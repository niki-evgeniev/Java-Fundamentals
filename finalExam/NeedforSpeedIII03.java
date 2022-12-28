package finalExam;

import java.util.*;

public class NeedforSpeedIII03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] cars = scanner.nextLine().split("\\|");
            String car = cars[0];
            int km = Integer.parseInt(cars[1]);
            int fuel = Integer.parseInt(cars[2]);
            carMap.put(car, new ArrayList<>());
            carMap.get(car).add(km);
            carMap.get(car).add(fuel);
        }
        String commands = scanner.nextLine();

        while (!commands.equals("Stop")) {
            String[] command = commands.split(" : ");
            String car = "";
            int fuel = 0;

            switch (command[0]) {
                case "Drive":
                    car = command[1];
                    int distance = Integer.parseInt(command[2]);
                    fuel = Integer.parseInt(command[3]);
                    int currentFuel = carMap.get(car).get(1);
                    int currentKm = carMap.get(car).get(0);
                    if (currentFuel < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        currentFuel = currentFuel - fuel;
                        currentKm = currentKm + distance;
                        carMap.get(car).set(0, currentKm);
                        carMap.get(car).set(1, currentFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    if (currentKm >= 100000) {
                        carMap.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                case "Refuel":
                    car = command[1];
                    fuel = Integer.parseInt(command[2]);
                    currentFuel = carMap.get(car).get(1);
                    if (currentFuel + fuel > 75) {
                        int fuelTo75 = 75 - currentFuel;
                        carMap.get(car).set(1, 75);
                        System.out.printf("%s refueled with %d liters%n", car, fuelTo75);
                    } else {
                        currentFuel = currentFuel + fuel;
                        carMap.get(car).set(1, currentFuel);
                        System.out.printf("%s refueled with %d liters%n", car, fuel);
                    }
                    break;
                case "Revert":
                    car = command[1];
                    int kmToRemove = Integer.parseInt(command[2]);
                    currentKm = carMap.get(car).get(0);
                    currentKm = currentKm - kmToRemove;
                    if (currentKm < 10000) {
                        currentKm = 10000;
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kmToRemove);
                    }
                    carMap.get(car).set(0, currentKm);
                    break;
            }
            commands = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Mileage: " + entry.getValue().get(0) + " kms, Fuel in the tank: " + entry.getValue().get(1) + " lt.");
        }


    }
}
