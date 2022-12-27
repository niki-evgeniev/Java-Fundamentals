package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra02Test {
    public static <list> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //String regex = "([\\||#])(?<foodname>[A-Za-z\\s]+)\\1(?<date>[0-9][0-9]\\/[0-9][0-9]\\/[0-9][0-9])\\1(?<calories>[0-9][0-9]*)\\1";
        // String regex = "([\\||#])(?<foodname>[A-Za-z\\s]+)\\1(?<date>[0-9][0-9]\\/[0-9][0-9]\\/[0-9][0-9])\\1(?<calories>[1-9][0-9]?[0-9]?[0-9]?[0-9]?)\\1";
        String regex = "([\\||#])(?<foodname>[A-Za-z\\s]+)\\1(?<date>[0-9][0-9]\\/[0-9][0-9]\\/[0-9][0-9])\\1(?<calories>[0-9][0-9]{0,4})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int totalCalories = 0;
        List<String> listFood = new ArrayList<>();
        while (matcher.find()){
            String foodname = matcher.group("foodname");
            String date = matcher.group("date");
            String calories = matcher.group("calories");
            int currentCalories = Integer.parseInt(matcher.group("calories"));
            totalCalories += currentCalories;
            listFood.add("Item: "+ foodname + ", Best before: " + date + ", Nutrition: " + calories);
        }
        int day = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", day);
        for (String food :listFood) {
            System.out.println(food);

        }
    }
}
