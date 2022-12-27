package ExerciseAssociativeArrays;

import java.util.*;

public class StudentAcademy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studens = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studens.containsKey(name)) {
                studens.put(name, new ArrayList<>());
                studens.get(name).add(grade);
            } else {
                studens.get(name).add(grade);
            }
        }
        double gradeSum = 0;

        Map<String, Double> grades = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studens.entrySet()) {
            List<Double> allGrade = entry.getValue();
            String name = entry.getKey();
            for (double grade : allGrade) {
                gradeSum += grade;
            }
            gradeSum = gradeSum / allGrade.size();
            if (gradeSum >= 4.50) {
                grades.put(name, gradeSum);
            }
            gradeSum = 0;
        }

        for (Map.Entry<String, Double> doubleEntry : grades.entrySet()) {
            System.out.printf("%s -> %.2f%n", doubleEntry.getKey(), doubleEntry.getValue());
        }
    }
}

