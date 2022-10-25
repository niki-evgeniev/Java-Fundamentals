package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class PassedorFailed03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        if (input >=3){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
