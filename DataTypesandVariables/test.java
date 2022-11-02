package DataTypesandVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double a = Double.parseDouble(scanner.nextLine());
//        double b = Double.parseDouble(scanner.nextLine());
//        double result = a * b;
//        System.out.printf("%s * %s = %s",a,b,result);
//        double a = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
//        System.out.println(a);
//        BigDecimal b = new BigDecimal(0);
//        b = b.add(0.1) + b.add(0.1);
        char a = scanner.nextLine().charAt(0);
        System.out.println(a);
        System.out.printf("%c + %c", a, a);

    }
}
