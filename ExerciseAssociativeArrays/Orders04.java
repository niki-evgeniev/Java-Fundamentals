package ExerciseAssociativeArrays;

import java.util.*;

public class Orders04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<Double>> allProduct = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] product = input.split(" ");
            String nameProduct = product[0];
            double price = Double.parseDouble(product[1]);
            double quality = Double.parseDouble(product[2]);
            ;
            if (!allProduct.containsKey(nameProduct)) {
                allProduct.put(nameProduct, new ArrayList<>());
                allProduct.get(nameProduct).add(price);
                allProduct.get(nameProduct).add(quality);
            } else {
                allProduct.get(nameProduct);
                double sum = allProduct.get(nameProduct).get(0);
                double sumQuality = allProduct.get(nameProduct).get(1);
                allProduct.get(nameProduct).set(0, price);
                allProduct.get(nameProduct).set(1, quality + sumQuality);
            }


            input = scanner.nextLine();
        }
        // index 0 = цена
        // index 1 = количество
        for (Map.Entry<String, List<Double>> entry : allProduct.entrySet()) {
            double sumPrice = entry.getValue().get(1) * entry.getValue().get(0);
            System.out.printf("%s -> %.2f%n", entry.getKey(), sumPrice);
        }

    }
}
