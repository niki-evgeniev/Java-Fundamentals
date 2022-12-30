package midExam;

import java.util.Scanner;

public class CounterStrike01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countBattle = 0;
        int count3 = 1;
        boolean isValid = false;

        while (!command.equals("End of battle")) {
            int shoot = Integer.parseInt(command);
            if (energy >= shoot){
                countBattle++;
                energy = energy - shoot;
            }else if (shoot >= energy){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countBattle, energy);
                isValid = true;
                break;
            }


            if (count3 % 3 == 0) {
                energy = energy + countBattle;
                //count3 = 1;
            }
            count3++;

            command = scanner.nextLine();
        }

        if (!isValid){
            System.out.printf("Won battles: %d. Energy left: %d",countBattle,energy);
        }

    }
}
