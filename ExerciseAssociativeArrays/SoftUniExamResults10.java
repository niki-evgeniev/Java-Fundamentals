package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> students = new LinkedHashMap<>();
        Map<String, Integer> course = new LinkedHashMap<>();
        while (!input.contains("exam finished")) {
            String[] commands = input.split("-");
            String name = commands[0];
            String leng = commands[1];

            if (!leng.equals("banned")) {
                int score = Integer.parseInt(commands[2]);
                if (!students.containsKey(name)) {
                    students.put(name, score);
                } else {
                    int results = students.get(name);
                    if (results > score) {

                    } else if (results < score) {
                        students.put(name, score);
                    }
                }

            } else if (leng.equals("banned")) {
                students.remove(name);
            }
            if (!leng.equals("banned")) {
                if (!course.containsKey(leng)) {
                    course.put(leng, 1);

                } else {
                    int currentScrore = course.get(leng);
                    course.put(leng, currentScrore + 1);
                }
            }else {
               break;
            }


            input = scanner.nextLine();
        }
        System.out.println();

        System.out.println("Results:");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : course.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
