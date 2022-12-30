package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> house = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int indexCount = 0;
        while (!input.contains("Love!")) {
            String[] comands = input.split(" ");
            String command1 = comands[0];
            int command2 = Integer.parseInt(comands[1]);
            indexCount = indexCount + command2;
            if (indexCount > house.size() - 1) {
                indexCount = 0;
            }
            int number = house.get(indexCount);
            if (number <= 0) {
                int index = house.indexOf(indexCount);
                System.out.printf("Place %d already had Valentine's day.%n", indexCount);
            } else {
                number = number - 2;
                house.set(indexCount, number);
                if (number <= 0) {
                    System.out.printf("Place %d has Valentine's day.%n", indexCount);
                }
            }


            input = scanner.nextLine();
        }
        int countFail = 0;
        for (int i = 0; i <= house.size() - 1; i++) {
            int number = house.get(i);
            if (number > 0) {
                countFail++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n",indexCount);
        if (countFail == 0){
            System.out.printf("Mission was successful.%n");
        }else {
            System.out.printf("Cupid has failed %d places.%n",countFail);
        }

    }
}
