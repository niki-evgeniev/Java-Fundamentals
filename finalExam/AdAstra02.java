package finalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([\\||#])(?<foodname>[A-Za-z\\s]+)\\1(?<date>[0-9][0-9]\\/[0-9][0-9]\\/[0-9][0-9])\\1(?<calories>[0-9][0-9]{0,4})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int totalCalories = 0;

        Map<String, List<String>> foodMap = new LinkedHashMap<>();

        while (matcher.find()) {
            String foodname = matcher.group("foodname");
            String date = matcher.group("date");
            String calories = matcher.group("calories");
            int currentCalories = Integer.parseInt(matcher.group("calories"));
            totalCalories += currentCalories;
            foodMap.put(foodname, new ArrayList<>());
            foodMap.get(foodname).add(date);
            foodMap.get(foodname).add(calories);
        }

        int day = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", day);
        for (Map.Entry<String, List<String>> entry : foodMap.entrySet()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
