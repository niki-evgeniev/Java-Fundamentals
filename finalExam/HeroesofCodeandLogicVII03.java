package finalExam;

import java.util.*;

public class HeroesofCodeandLogicVII03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            heroMap.put(input[0], new ArrayList<>());
            heroMap.get(input[0]).add(Integer.parseInt(input[1]));
            heroMap.get(input[0]).add(Integer.parseInt(input[2]));
        }

        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            String[] command = commands.split(" - ");
            String heroName = command[1];
            int hp = 0;
            int mp = 0;
            if (commands.contains("CastSpell")) {
                //CastSpell – {hero name} – {MP needed} – {spell name}"
                mp = heroMap.get(heroName).get(1);
                int needMp = Integer.parseInt(command[2]);
                if (mp >= needMp) {
                    mp = mp - needMp;
                    heroMap.get(heroName).set(1, mp);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, command[3], mp);
                } else if (needMp > mp) {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, command[3]);
                }
            } else if (commands.contains("TakeDamage")) {
                int damage = Integer.parseInt(command[2]);
                hp = heroMap.get(heroName).get(0);
                hp = hp - damage;
                if (hp > 0) {
                    heroMap.get(heroName).set(0, hp);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, command[3], hp);
                } else {
                    heroMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, command[3]);
                }
            } else if (commands.contains("Recharge")) {
                int amountMp = Integer.parseInt(command[2]);
                mp = heroMap.get(heroName).get(1);
                if (mp + amountMp > 200) {
                    int mp200 = 200;
                    mp200 = mp200 - mp;
                    heroMap.get(heroName).set(1, 200);
                    System.out.printf("%s recharged for %d MP!%n", heroName, mp200);
                } else {
                    mp = mp + amountMp;
                    heroMap.get(heroName).set(1, mp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amountMp);
                }

            } else if (commands.contains("Heal")) {
                hp = heroMap.get(heroName).get(0);
                int amountHp = Integer.parseInt(command[2]);
                if (hp + amountHp > 100) {
                    int hp100 = 100;
                    hp100 = hp100 - hp;
                    heroMap.get(heroName).set(0, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, hp100);
                } else {
                    hp = hp + amountHp;
                    heroMap.get(heroName).set(0, hp);
                    System.out.printf("%s healed for %d HP!%n", heroName, amountHp);
                }
            }
            commands = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : heroMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("HP: " + entry.getValue().get(0));
            System.out.println("MP: " + entry.getValue().get(1));
        }

    }
}
