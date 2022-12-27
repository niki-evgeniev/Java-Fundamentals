package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int game = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;
        int countKey2 = 0;

        for (int i = 1; i <= game; i++) {
            if (i % 2 == 0) {
                countHeadset++;
            }
            if (i % 3 == 0) {
                countMouse++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                countKeyboard++;
                countKey2++;
            }
            if (countKey2 == 2) {
                countDisplay++;
                countKey2 = 0;
            }
        }

        double totalPrice = countHeadset * headset + countMouse * mouse + countKeyboard * keyboard + countDisplay * display;
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
