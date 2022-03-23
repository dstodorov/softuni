package SoftUni.fundamentalsJanuary.regularExpressions.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOFMessages = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> attackedPlanets = new TreeMap<>();
        Map<String, Integer> destroyedPlanets = new TreeMap<>();

        Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^-@!:>]*:(?<population>\\d+)[^-@!:>]*!(?<attackType>[AD])![^-@!:>]*->(?<soldierCount>\\d+)");

        for (int i = 0; i < numberOFMessages; i++) {
            String encryptedMessage = scanner.nextLine();
            int key = lettersCount(encryptedMessage);
            String decryptedMessage = getDecryptedMessage(encryptedMessage, key);

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String planetName = matcher.group("name");
                int planetPopulation = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attackType.equals("A")) {
                    addPlanet(attackedPlanets, planetName);
                } else if (attackType.equals("D")) {
                    addPlanet(destroyedPlanets, planetName);
                }
            }
        }

        System.out.print("Attacked planets: ");
        printPlanets(attackedPlanets);
        System.out.print("Destroyed planets: ");
        printPlanets(destroyedPlanets);

    }

    private static void printPlanets(Map<String, Integer> planets) {
        System.out.println(planets.size());

        for (Map.Entry<String, Integer> planet : planets.entrySet()) {
            System.out.printf("-> %s%n", planet.getKey());
        }
    }

    private static void addPlanet(Map<String, Integer> planets, String planetName) {
        if (planets.containsKey(planetName)) {
            planets.put(planetName, planets.get(planetName) + 1);
        } else {
            planets.put(planetName, 1);
        }
    }

    private static String getDecryptedMessage(String encryptedMessage, int key) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < encryptedMessage.length(); i++) {
            int encryptedCharCode = encryptedMessage.charAt(i);
            int decryptedCharCode = encryptedCharCode - key;
            decryptedMessage.append((char) decryptedCharCode);
        }

        return decryptedMessage.toString();
    }

    static int lettersCount(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = Character.toLowerCase(text.charAt(i));
            if (currentChar == 's' || currentChar == 't' || currentChar == 'a' || currentChar == 'r') {
                count++;
            }
        }

        return count;
    }
}
