package midExam;

import java.util.Scanner;

public class ComputerStore01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("special") && !input.equals("regular")){
            Double price = Double.parseDouble(input);
            if (price < 0){
                System.out.println("Invalid price!");
                input= scanner.nextLine();
                continue;
            }else {
                sum += price;
            }
            input= scanner.nextLine();
        }
        if (sum == 0){
            System.out.println("Invalid order!");
        }else if (input.equals("special")){
            double sumWithTaxes = sum * 0.2;
            double sumSpecial = (sumWithTaxes + sum) * 0.9;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", sumWithTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", sumSpecial);
        }else {
            double sumWithTaxes = sum * 0.2;
            double sumTotal = sumWithTaxes + sum;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", sumWithTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", sumTotal);
        }
    }
}
