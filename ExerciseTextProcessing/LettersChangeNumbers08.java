package ExerciseTextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] letterNumber = input.split("\\s+");
        double sumNumber = 0;

        for (String code : letterNumber) {
            double number = numberLetter(code);
            if (Character.isUpperCase(code.charAt(0))) {
                int numberChar = code.charAt(0);
                int poitionLetter = positionUpperLetterAlphabet(numberChar);
                sumNumber += number / poitionLetter;

            } else if (Character.isLowerCase(code.charAt(0))) {
                int lastNumberChar = code.charAt(0);
                int positionLetter = positionLowerLetterAlphabet(lastNumberChar);
                sumNumber += number * positionLetter;
            }
            if (Character.isUpperCase(code.charAt(code.length() - 1))) {
                int numberChar = code.charAt(code.length() - 1);
                int poitionLetter = positionUpperLetterAlphabet(numberChar);
                sumNumber = sumNumber - poitionLetter;

            } else if (Character.isLowerCase(code.charAt(code.length() - 1))) {
                int lastnumberChar = code.charAt(code.length() - 1);
                int poitionLetter = positionLowerLetterAlphabet(lastnumberChar);
                sumNumber =  sumNumber + poitionLetter;
            }

        }

        System.out.printf("%.2f", sumNumber);
    }

    public static double numberLetter(String code) {
        double numberLetter = Double.parseDouble(code.replace(code.charAt(0), ' ') //" 12b"
                .replace(code.charAt(code.length() - 1), ' ') //" 12 "
                .trim());
        return numberLetter;
    }

    public static int positionUpperLetterAlphabet(int numberChar) {
        //upper
        int upperLeeterPosition = numberChar - 64;
        return upperLeeterPosition;
    }

    public static int positionLowerLetterAlphabet(int numberChar) {
        int lowerLeeterPosiron = numberChar - 96;
        return lowerLeeterPosiron;
    }
}
