package ExerciseDataTypesandVariables;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        //int consume = yield;
        int caunt = 0;
        int totalAmount = 0;

        while(yield >= 100){
            caunt++;
            totalAmount += yield - 26;
            yield -= 10;
        }
        if (totalAmount >= 26){
            totalAmount -= 26;
        }
        System.out.println(caunt);
        System.out.println(totalAmount);
    }
}
