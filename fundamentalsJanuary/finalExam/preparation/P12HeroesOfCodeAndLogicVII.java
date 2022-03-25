package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P12HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        Map<String, Hero> heroes = new LinkedHashMap<>();

        for (int i = 0; i < numberOfHeroes; i++) {
            String[] heroInfo = scanner.nextLine().split("\\s");
            heroes.putIfAbsent(heroInfo[0], new Hero(heroInfo[0], Integer.parseInt(heroInfo[1]), Integer.parseInt(heroInfo[2])));
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputCommands = input.split("\\s-\\s");
            String name = inputCommands[1];
            Hero currentHero = heroes.get(name);

            switch (inputCommands[0]) {
                case "CastSpell": {
                    if (currentHero.getManaPoints() >= Integer.parseInt(inputCommands[2])) {
                        cast(currentHero, Integer.parseInt(inputCommands[2]));
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", currentHero.getName(), inputCommands[3], currentHero.getManaPoints());
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, inputCommands[3]);
                    }
                    break;
                }
                case "TakeDamage": {
                    if (currentHero.getHitPoints() - Integer.parseInt(inputCommands[2]) > 0) {
                        hitHero(currentHero, Integer.parseInt(inputCommands[2]));
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", currentHero.getName(), Integer.parseInt(inputCommands[2]), inputCommands[3], currentHero.hitPoints);
                    } else {
                        killHero(heroes, currentHero);
                        System.out.printf("%s has been killed by %s!%n", currentHero.getName(), inputCommands[3]);
                    }
                    break;
                }
                case "Recharge": {
                    int recoveredPoints = 0;
                    if (currentHero.getManaPoints() + Integer.parseInt(inputCommands[2]) > 200) {
                        recoveredPoints = 200 - currentHero.getManaPoints();
                    } else {
                        recoveredPoints = Integer.parseInt(inputCommands[2]);
                    }
                    recharge(currentHero, recoveredPoints);
                    System.out.printf("%s recharged for %d MP!%n", currentHero.getName(), recoveredPoints);
                    break;
                }
                case "Heal": {
                    int recoveredPoints = 0;
                    if (currentHero.getHitPoints() + Integer.parseInt(inputCommands[2]) > 100) {
                        recoveredPoints = 100 - currentHero.getHitPoints();
                    } else {
                        recoveredPoints = Integer.parseInt(inputCommands[2]);
                    }
                    heal(currentHero, recoveredPoints);
                    System.out.printf("%s healed for %d HP!%n", currentHero.getName(), recoveredPoints);
                    break;
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Hero> hero : heroes.entrySet()) {
            Hero currentHero = hero.getValue();
            System.out.printf("%s%n", currentHero.getName());
            System.out.printf("  HP: %d%n", currentHero.getHitPoints());
            System.out.printf("  MP: %d%n", currentHero.getManaPoints());
        }
    }

    private static void heal(Hero hero, int recoveredPoints) {
        hero.setHitPoints(hero.getHitPoints() + recoveredPoints);
    }

    private static void recharge(Hero hero, int recoveredPoints) {
        hero.setManaPoints(hero.getManaPoints() + recoveredPoints);
    }

    private static void killHero(Map<String, Hero> heroes, Hero hero) {
        heroes.remove(hero.getName());
    }

    private static void hitHero(Hero currentHero, int damage) {
        currentHero.setHitPoints(currentHero.getHitPoints() - damage);
    }

    private static void cast(Hero currentHero, int spellManaPoints) {
        currentHero.setManaPoints(currentHero.getManaPoints() - spellManaPoints);
    }

    private static class Hero {

        private String name;
        private int hitPoints;
        private int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }

    }
}
