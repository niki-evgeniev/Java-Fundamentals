package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hour * 60 + minutes + 30;
        int totalHour = totalMinutes / 60;
        int totalMinutess = totalMinutes % 60;
        if (totalHour > 23) {
            totalHour = 0;
        }
        System.out.printf("%d:%02d", totalHour, totalMinutess);
    }
}
