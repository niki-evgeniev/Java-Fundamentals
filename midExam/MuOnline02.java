package midExam;

import java.util.Scanner;

public class MuOnline02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roomArr = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i <= roomArr.length - 1; i++) {
            String input = roomArr[i];
            String command1 = input.split(" ")[0];
            int command2 = Integer.parseInt(input.split(" ")[1]);
            //System.out.println();
            switch (command1) {
                case "potion":
                    int blood = 100;
                    int bloodhealth = blood - health;
                    health = health + command2;
                    if (bloodhealth > command2) {
                        System.out.printf("You healed for %d hp.%n", command2);
                        System.out.printf("Current health: %d hp.%n", health);

                    } else if (bloodhealth < command2) {
                        if (health >= 100) {
                            health = 100;
                        }
                        System.out.printf("You healed for %d hp.%n", bloodhealth);
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    bitcoins = bitcoins + command2;
                    System.out.printf("You found %d bitcoins.%n", command2);
                    break;
                default:
                    health = health - command2;
                    if (health <= 0) {
                        System.out.printf("You died! Killed by %s.%n", command1);
                        System.out.printf("Best room: %d", i + 1);
                    } else {
                        System.out.printf("You slayed %s.%n", command1);
                    }

            }
            if (health <= 0 ){
                break;
            }
        }
        if (health > 0 ){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
