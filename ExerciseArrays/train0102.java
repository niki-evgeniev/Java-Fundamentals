package ExerciseArrays;

import java.util.Scanner;

public class train0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] people = new int[n];

        for (int i = 0; i < n; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            people[i] = countPeople;
        }
        int count = 0;

        for (int number : people) {
            count += number;
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println(count);
    }
}
