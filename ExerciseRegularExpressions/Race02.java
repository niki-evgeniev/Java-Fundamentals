package ExerciseRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        List<String> wordList = Arrays.stream(word.split(", ")).collect(Collectors.toList());
        Map<String, Integer> mapName = new LinkedHashMap<>();
        wordList.forEach(name -> mapName.put(name, 0));

        String input = scanner.nextLine();

        String regexLetter = "[A-Za-z]+";
        String regexDigit = "[0-9]";
        StringBuilder sb = new StringBuilder();

        Pattern patternLetter = Pattern.compile(regexLetter);
        Pattern patternDigit = Pattern.compile(regexDigit);

        while (!input.equals("end of race")) {
            int digit = 0;
            String letter = "";
            Matcher matcherLetter = patternLetter.matcher(input);
            while (matcherLetter.find()) {
                letter = letter + matcherLetter.group();
            }
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()) {
                digit += Integer.parseInt(matcherDigit.group());
            }
            if (mapName.containsKey(letter)) {
                int value = mapName.get(letter);
                int currentKm = mapName.get(letter);
                currentKm = currentKm + digit;
                mapName.put(letter, currentKm);
            }

            input = scanner.nextLine();
        }
        System.out.println();
        List<String> nameOfFirstThree = mapName.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));
    }
}
