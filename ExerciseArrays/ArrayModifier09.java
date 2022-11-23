package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String action = scanner.nextLine();

        while (!action.equals("end")) {
            String[] actionArr = action.split(" ");
            String command = actionArr[0];
            switch (command) {
                case "swap":
                    int a = Integer.parseInt(actionArr[1]);
                    int elementFir = numb[a];
                    int b = Integer.parseInt(actionArr[2]);
                    int elementSec = numb[b];

                    numb[a] = elementSec;
                    numb[b] = elementFir;
                    break;
                case "multiply":
                    int aMultiply = Integer.parseInt(actionArr[1]);
                    int elementFirMultiply = numb[aMultiply];
                    int bMultiply = Integer.parseInt(actionArr[2]);
                    int elementSecMultiply = numb[bMultiply];

                    numb[aMultiply] = elementFirMultiply * elementSecMultiply;
                    break;
                case "decrease":
                    for (int i = 0; i <= numb.length - 1; i++) {

                        numb[i] = numb[i] - 1;
                    }

            }
            action = scanner.nextLine();
        }
        for (int i = 0; i <= numb.length - 1; i++) {
            if (i == numb.length - 1) {
                System.out.print(numb[i]);

            } else {
                System.out.print(numb[i] + ", ");
            }

        }

    }
}

