package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceLights = 1.0;
        double students = Double.parseDouble(scanner.nextLine());
        double totalPrice = priceLights * Math.ceil(students + students * 0.1);
        System.out.println(totalPrice);



    }
}
