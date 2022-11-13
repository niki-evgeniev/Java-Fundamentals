package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String password = "";
        for (int i = user.length() - 1; i >= 0; i--) {
            char letter = user.charAt(i);
            password += letter;
        }
        int count = 0;
        String login = scanner.nextLine();
        while (!login.equals(password)) {
            count++;
            if (count == 4) {
                break;
            }
            System.out.println("Incorrect password. Try again.");
            login = scanner.nextLine();
        }
        if (count < 4) {
            System.out.printf("User %s logged in.", user);
        }else if (count>= 4){
            System.out.printf("User %s blocked!",user);
        }
    }
}
