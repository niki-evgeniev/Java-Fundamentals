package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople = Integer.parseInt(scanner.nextLine());
        List<Integer> vagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <= vagons.size() - 1; i++) {
            if (vagons.size() - 1 == 4) {
                break;
            }
            for (int k = 0; k <= 4; k++) {
                int number = vagons.get(i);
                number++;
                vagons.set(i, number);
                numberPeople--;
                if (number == 4) {
                    break;
                }
                if (numberPeople == 0){
                    break;
                }
            }


        }

        if (numberPeople <= 0) {
            System.out.println("The lift has empty spots!");
            for (int number : vagons) {
                System.out.print(number + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", numberPeople);
            for (int number : vagons) {
                System.out.print(number + " ");
            }
        }

    }
}
