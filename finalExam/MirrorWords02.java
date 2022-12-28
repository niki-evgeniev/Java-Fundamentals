package finalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([@#])(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int counter = 0;
        Map<String, String> mapWord = new LinkedHashMap<>();

        while (matcher.find()) {
            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            StringBuilder reversSecond = new StringBuilder();
            counter++;
            for (int i = secondWord.length() - 1; i >= 0; i--) {
                reversSecond.append(secondWord.charAt(i));
            }
            String wordMirror = reversSecond.toString();
            if (firstWord.equals(wordMirror)) {
                mapWord.put(firstWord, secondWord);
            }
        }
        List<String> listWord = new ArrayList<>();
        if (mapWord.isEmpty() && counter > 0) {
            System.out.printf("%d word pairs found!%n", counter);
            System.out.printf("No mirror words!");

        } else if (mapWord.isEmpty() && counter == 0) {
            System.out.printf("No word pairs found!%n", counter);
            System.out.printf("No mirror words!");

        } else {
            System.out.printf("%d word pairs found!%n", counter);
            for (Map.Entry<String, String> entry : mapWord.entrySet()) {
                listWord.add(entry.getKey() + " <=> " + entry.getValue());
            }
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", listWord));

        }
    }
}
