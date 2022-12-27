package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = Arrays.stream(scanner.nextLine()
                        .split("\\, "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        String exercise = "";

        while (!command.contains("course start")) {
            String[] tittle = command.split("\\:");
            String lessonTitle = tittle[1];

            if (command.contains("Add")) {
                if (lessons.contains(tittle[1])) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    lessons.add(tittle[1]);
                }
            } else if (command.contains("Insert")) {
                if (lessons.contains(tittle[1])) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    int index = Integer.parseInt(command.split("\\:")[2]);
                    lessons.add(index, tittle[1]);
                }
            } else if (command.contains("Remove")) {
                exercise = tittle[1] + "-Exercise";
                if (lessons.contains(tittle[1])) {
                    lessons.remove(tittle[1]);
                    if (lessons.contains(exercise)) {
                        int indexRemove = lessons.indexOf(exercise);
                        lessons.remove(indexRemove);
                    }
                }
            } else if (command.contains("Swap")) {
                if (lessons.contains(tittle[1]) && lessons.contains(tittle[2])) {
                    int firstElement = lessons.indexOf(tittle[1]);
                    int secondElement = lessons.indexOf(tittle[2]);
                    lessons.set(firstElement, tittle[2]);
                    lessons.set(secondElement, tittle[1]);
                }
            } else if (command.contains("Exercise")) {
                if (lessons.contains(tittle[1] + "-Exercise")) {

                } else {
                    if (lessons.contains(tittle[1])) {
                        exercise = tittle[1] + "-Exercise";
                        lessons.add(exercise);
                    } else {
                        String leason = tittle[1];
                        exercise = tittle[1] + "-Exercise";
                        lessons.add(leason);
                        lessons.add(exercise);
                    }
                }
            }
            command = scanner.nextLine();

        }

        if (exercise == "") {
            for (int i = 0; i <= lessons.size() - 1; i++) {
                String check = lessons.get(i);
                if (check.contains("Exercise")) {
                    exercise = lessons.get(i);
                }
            }
        }

        if (lessons.contains(exercise)) {
            int exFirst = lessons.indexOf(exercise);
            String exerciseArr = exercise.split("\\-")[0];
            int exSec = lessons.indexOf(exerciseArr);
            lessons.remove(exFirst);
            if (exSec + 1 > lessons.size() - 1) {
                lessons.add(exercise);
            } else {
                lessons.add(exSec + 1, exercise);
            }
        }
        for (int i = 0; i <= lessons.size() - 1; i++) {
            System.out.println(i + 1 + "." + lessons.get(i));
        }
    }
}

