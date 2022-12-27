package ExerciseTextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secNum = new BigInteger(scanner.nextLine());

        System.out.println(firstNum.multiply(secNum));
    }
}
