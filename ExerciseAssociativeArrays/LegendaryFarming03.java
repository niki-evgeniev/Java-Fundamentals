package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> weapons = new LinkedHashMap<>();
        weapons.put("shards", 0);//Shards - Shadowmourne
        weapons.put("fragments", 0);//Fragments - Valanyr
        weapons.put("motes", 0);//Motes - Dragonwrath

        Map<String, Integer> junks = new LinkedHashMap<>();

        boolean getWeapon = false;

        while (!getWeapon) {
            String input = scanner.nextLine().toLowerCase();
            String[] allMaterial = input.split(" ");
            for (int i = 0; i <= allMaterial.length - 1; i += 2) {
                int qualityMaterial = Integer.parseInt(allMaterial[i]);
                String nameMaterial = allMaterial[i + 1];
                if (nameMaterial.contains("shards") || nameMaterial.contains("fragments") || nameMaterial.contains("motes")) {
                    int current = weapons.get(nameMaterial);
                    weapons.put(nameMaterial, current + qualityMaterial);
                } else {
                    if (!junks.containsKey(nameMaterial)) {
                        junks.put(nameMaterial, qualityMaterial);
                    } else {
                        int current = junks.get(nameMaterial);
                        junks.put(nameMaterial, qualityMaterial + current);
                    }
                }
                if (weapons.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    weapons.put("shards", weapons.get("shards") - 250);
                    getWeapon = true;
                    break;
                } else if (weapons.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    weapons.put("fragments", weapons.get("fragments") - 250);
                    getWeapon = true;
                    break;
                } else if (weapons.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    weapons.put("motes", weapons.get("motes") - 250);
                    getWeapon = true;
                    break;
                }
                if (getWeapon) {
                    break;
                }

            }
        }
        for (Map.Entry<String, Integer> entry : weapons.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
