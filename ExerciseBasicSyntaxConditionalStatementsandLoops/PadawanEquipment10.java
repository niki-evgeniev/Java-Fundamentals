package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLights = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        double studentsCount = students;
        int freebelts = 0;

        if (students > 5) {
            freebelts = students / 6;
            studentsCount -= freebelts;
        }

        double totalPrice = priceLights * Math.ceil(students + students * 0.1) + priceRobes * students + priceBelts * studentsCount;
        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - money);
        }
    }
}
