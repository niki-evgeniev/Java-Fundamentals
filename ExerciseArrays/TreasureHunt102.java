package ExerciseArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = Arrays.stream(scanner.nextLine()
                        .split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.next();

        while (!input.contains("Yohoho!")) {
            String[] commands = input.split(" ");
        }
    }
}
