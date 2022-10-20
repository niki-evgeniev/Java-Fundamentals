package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalminutes = hour * 60 + minutes + 30;
        int totalhour = totalminutes / 60;
        int totalminutess = totalminutes % 60;
        if (totalhour > 23 ){
            totalhour = 0;
        }
        System.out.printf("%d:%02d", totalhour, totalminutess);
    }
}
