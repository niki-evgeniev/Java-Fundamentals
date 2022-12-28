package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([=|\\/])(?<city>[A-Z][A-Za-z]{2,})+\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> list = new ArrayList<>();
        int point = 0;

        while (matcher.find()){
            String city = matcher.group("city");
            point += city.length();
            list.add(city);
        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", list));
        System.out.printf("Travel Points: %d",point);





    }
}
