package ExercisesMethods;

import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        topNumber(n);

    }

    public static void topNumber(int number) {

        for (int j = 1; j <= number; j++) {
            int results = 0;
            int numb = j;
            while (numb > 0) {
                int a = numb % 10;
                results += a;
                numb = numb / 10;
            }
            if (results % 8 == 0) {
                numb = j;
                while (numb > 0){
                int b = numb % 10;
                results += b;
                numb = numb / 10;
                if (numb % 2 != 0) {


                    System.out.println(j);
                }
                }

            } else {
                results = 0;
            }
        }
    }
}


