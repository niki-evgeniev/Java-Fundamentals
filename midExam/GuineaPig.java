package midExam;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine()) * 1000.00;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000.00;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000.00;
        double kg = Double.parseDouble(scanner.nextLine());
        boolean foodFish = false ;


        for (int i = 1; i <= 30; i++) {
            food = food - 300;
            if (i % 2 == 0) {
                double hayGramsToEat = food * 0.05;
                hay = hay - hayGramsToEat;
            }
            if (i % 3 == 0) {
                double kgToEat = kg / 3;
                cover = cover - (kgToEat * 1000);
            }
            if (food <= 0 || cover <= 0 || hay <= 0){
                foodFish = true;
                break;
            }
        }
        food = food / 1000;
        hay = hay / 1000;
        cover = cover / 1000;
        if (foodFish){
            System.out.println("Merry must go to the pet store!");
        }else if (!foodFish){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",food,hay,cover);
        }
    }

}
