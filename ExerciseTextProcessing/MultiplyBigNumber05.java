package ExerciseTextProcessing;

import java.util.Scanner;

public class MultiplyBigNumber05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        sb = multi(firstInput,secondInput);

        System.out.println(sb);
    }
    public static StringBuilder multi (String first, String second){
        char[] firstArr = first.toCharArray();
        int sums = 0;
        StringBuilder sum = new StringBuilder();
        for (int i = firstArr.length-1; i >= 0 ; i--) {
            String numOne = firstArr[i] + "";
            int firstNum = Integer.parseInt(numOne);
            int secNum = Integer.parseInt(second);
            sums = firstNum * secNum;
            sum.append(sums);
        }
        sum.reverse();
        return sum;
    }
}
