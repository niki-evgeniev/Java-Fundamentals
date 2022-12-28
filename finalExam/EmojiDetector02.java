package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([\\:\\:]{2}|[**]{2})([A-Z][a-z]{2,}+)\\1";
        String regexNumber = "[0-9]";

        Pattern patternLetter = Pattern.compile(regex);
        Pattern patternNumber = Pattern.compile(regexNumber);
        Matcher matcherLetter = patternLetter.matcher(input);
        Matcher matcherNumber = patternNumber.matcher(input);

        int sumDigit = 1;
        int counter = 0;
        List<String> emojy = new ArrayList<>();

        while (matcherNumber.find()) {
            int number = Integer.parseInt(matcherNumber.group());
            sumDigit = sumDigit * number;
        }
        while (matcherLetter.find()) {
            counter++;
            String letter = matcherLetter.group();
            int sumLetter = sumOfletter(letter);
            if (sumLetter > sumDigit){
                emojy.add(letter);
            }
        }

        System.out.printf("Cool threshold: %d%n", sumDigit);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",counter);
        emojy.forEach(System.out::println);

    }

    private static int sumOfletter(String letter) {
        int sumOfLetter = 0;
        for (int i = 2; i < letter.length() - 2; i++) {
            char[] symbol = letter.toCharArray();
            int symbolNumber = symbol[i];
            sumOfLetter = sumOfLetter + symbolNumber;
        }
        return sumOfLetter;
    }
}
