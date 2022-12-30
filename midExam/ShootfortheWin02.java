package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootfortheWin02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int coutTarget = 0;

        while (!input.equals("End")) {
            int command = Integer.parseInt(input);
            if (command > targets.size() - 1 ){
                input = scanner.nextLine();
                continue;
            }
            int getNumberShoot = targets.get(command);
            if (getNumberShoot > -1){
                coutTarget++;
                targets.set(command,- 1);
            }
            for (int i = 0; i <= targets.size() -1 ; i++) {
                int indexCheck = targets.get(i);
                if (indexCheck == -1){
                    continue;
                }else if (indexCheck <= getNumberShoot ){
                    indexCheck = indexCheck + getNumberShoot;
                    targets.set(i, indexCheck);
                }else if (indexCheck > getNumberShoot){
                    indexCheck = indexCheck - getNumberShoot;
                    targets.set(i,indexCheck);
                }
            }


            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",coutTarget);
        for (int number: targets) {
            System.out.print(number + " ");
        }
    }
}
