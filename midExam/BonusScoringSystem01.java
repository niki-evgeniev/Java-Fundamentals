package midExam;

import java.util.Scanner;

public class BonusScoringSystem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        double totalScort = 0.00;
        int lectures = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double score = (attendance * 1.00) / numberLectures * (5 + bonus);
           if (score > totalScort){
               totalScort = score;
               lectures = attendance;
           }
        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(totalScort));
        System.out.printf("The student has attended %d lectures.", lectures);
    }
}
