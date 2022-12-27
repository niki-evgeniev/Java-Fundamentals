package ExerciseRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetname>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[A|D])![^@!:>-]*->[^@!:>-]*(?<soldier>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanet = new ArrayList<>();
        List<String> destroyedPlanet = new ArrayList<>();

        int attackCounter = 0;
        int destroyCounter = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String newInput = decrypted(input);
            Matcher matcher = pattern.matcher(newInput);
            while (matcher.find()) {
                String namePlanet = matcher.group("planetname");
                String attacker = matcher.group("attack");
                switch (attacker) {
                    case "A":
                        attackedPlanet.add(namePlanet);
                        attackCounter++;

                        break;
                    case "D":
                        destroyedPlanet.add(namePlanet);
                        destroyCounter++;
                        break;
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attackCounter);
        Collections.sort(attackedPlanet);
        attackedPlanet.forEach(planet -> System.out.println("-> " + planet));
        Collections.sort(destroyedPlanet);
        System.out.printf("Destroyed planets: %d%n", destroyCounter);
        destroyedPlanet.forEach(planet -> System.out.println("-> " + planet));

    }

    public static String decrypted(String name) {
        int count = 0;
        String nameLowerletter = name;
        nameLowerletter = nameLowerletter.toLowerCase(Locale.ROOT);
        for (int i = 0; i <= nameLowerletter.length() - 1; i++) {
            char symbol = nameLowerletter.charAt(i);
            if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                count++;
            }
        }
        String decrypted = "";
        char[] symbol = name.toCharArray();
        for (char ch : symbol) {
            ch = (char) (ch - count);
            decrypted += ch;
        }
        return decrypted;
    }
}
