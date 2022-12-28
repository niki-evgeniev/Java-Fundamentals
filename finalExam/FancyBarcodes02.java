package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regexLetter = "([@][#]+)(?<letter>[A-Z][A-Za-z0-9]{4,}[A-Z])([@][#]+)";
        String regexDigit = "(?<digit>[0-9][0-9]*)";

        Pattern patternLetter = Pattern.compile(regexLetter);
        Pattern patternDigit = Pattern.compile(regexDigit);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcherLetter = patternLetter.matcher(input);
            String letterMatcher = "";
            if (matcherLetter.find()) {
                letterMatcher = matcherLetter.group("letter");
            } else {
                System.out.println("Invalid barcode");
                continue;
            }
            Matcher matcherDigit = patternDigit.matcher(letterMatcher);
            if (matcherDigit.find()) {
                StringBuilder groupString = new StringBuilder(matcherDigit.group("digit"));
                while (matcherDigit.find()) {
                    String currentSymbol = matcherDigit.group("digit");
                    //groupString += matcherDigit.group("digit");
                    groupString.append(currentSymbol);
                }

                System.out.printf("Product group: %s%n", groupString.toString());
            } else {
                System.out.println("Product group: 00");
            }
        }
    }
}