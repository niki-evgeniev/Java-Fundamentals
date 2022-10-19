package ArraysLab;

import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayWeek = Integer.parseInt(scanner.nextLine());
        if (dayWeek >= 1 && dayWeek <= 7){
            System.out.println(day [dayWeek - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
