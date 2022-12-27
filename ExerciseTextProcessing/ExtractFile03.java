package ExerciseTextProcessing;

import java.util.Scanner;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] directory = input.split("\\\\");
        String[] fileName = directory[directory.length-1].split("\\.");

        String fileNames = fileName[0];
        String fileExtension = fileName[1];
        System.out.println("File name: " + fileNames );
        System.out.println("File extension: " + fileExtension );
    }
}
