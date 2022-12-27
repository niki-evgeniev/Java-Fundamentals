package ExerciseTextProcessing;

import java.util.Scanner;

public class CharacterMultiplier02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(" ");
        char[] wordsFirst = words[0].toCharArray();
        char[] wordsSecond = words[1].toCharArray();
        int sumOfChar = 0;

        if (wordsFirst.length == wordsSecond.length) {
            for (int i = 0; i <= wordsFirst.length - 1; i++) {
                sumOfChar += wordsFirst[i] * wordsSecond[i];
            }
        } else if (wordsFirst.length > wordsSecond.length) {
            for (int i = 0; i < wordsSecond.length; i++) {
                sumOfChar += wordsFirst[i] * wordsSecond[i];
            }
            for (int i = wordsFirst.length -1; i > wordsSecond.length -1 ; i--) {
                sumOfChar += wordsFirst[i];
            }

        }else if (wordsSecond.length > wordsFirst.length){
            for (int i = 0; i < wordsFirst.length; i++) {
                sumOfChar += wordsFirst[i] * wordsSecond[i];
            }
            for (int i = wordsSecond.length -1; i > wordsFirst.length -1 ; i--) {
                sumOfChar += wordsSecond[i];
            }
        }

        System.out.println(sumOfChar);
    }
}
