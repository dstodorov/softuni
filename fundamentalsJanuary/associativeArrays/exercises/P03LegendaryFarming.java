package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import com.sun.source.tree.Tree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        boolean legendaryFound = false;

        while (!legendaryFound) {
            String[] inputMaterials = scanner.nextLine().split(" ");

            for (int i = 0; i < inputMaterials.length; i += 2) {
                String material = inputMaterials[i + 1].toLowerCase();
                Integer quantity = Integer.parseInt(inputMaterials[i]);

                if (!materials.containsKey(material)) {
                    materials.put(material, quantity);
                } else {
                    materials.put(material, materials.get(material) + quantity);
                }

                if (materials.containsKey("shards") && materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put(material, materials.get(material) - 250);
                    legendaryFound = true;
                    break;
                } else if (materials.containsKey("fragments") && materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put(material, materials.get(material) - 250);
                    legendaryFound = true;
                    break;
                } else if (materials.containsKey("motes") && materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put(material, materials.get(material) - 250);
                    legendaryFound = true;
                    break;
                }
            }
        }


        for (Map.Entry<String, Integer> occurrence : materials.entrySet()) {
            System.out.printf("%s: %d%n", occurrence.getKey(), occurrence.getValue());
        }
    }
}
