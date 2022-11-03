package ExerciseAssociativeArrays;

import java.util.*;

public class Courses06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> student = new LinkedHashMap<>();
        while (!input.equals("end")){
            String[] command = input.split(" : ");
            String course = command[0];
            String name = command[1];
            if (student.containsKey(course)){
               student.get(course).add(name);
            }else{
                student.put(course, new ArrayList<>());
                student.get(course).add(name);
            }
          //  System.out.println();


            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : student.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
           entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));


        }

    }
}
