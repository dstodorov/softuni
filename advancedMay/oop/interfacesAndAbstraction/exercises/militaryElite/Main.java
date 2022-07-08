package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite;

import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.interfaces.Spy;
import SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PrivateImpl> privates = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputParams = input.split("\\s+");

            String soldierType = inputParams[0];
            int id = Integer.parseInt(inputParams[1]);
            String soldierFirstName = inputParams[2];
            String soldierLastName = inputParams[3];

            switch (soldierType) {
                case "Private":
                    double soldierSalary = Double.parseDouble(inputParams[4]);

                    addPrivate(id, soldierFirstName, soldierLastName, soldierSalary, privates);
                    break;

                case "LieutenantGeneral":
                    double LieutenantGeneralSalary = Double.parseDouble(inputParams[4]);

                    List<PrivateImpl> team = addLieutenantTeam(privates, inputParams);
                    LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, soldierFirstName, soldierLastName, LieutenantGeneralSalary, team);
                    printSoldier(lieutenantGeneral);
                    break;

                case "Engineer":
                    double engineerSalary = Double.parseDouble(inputParams[4]);

                    String engineerCorps = inputParams[5];
                    List<Repair> repairs = getRepairs(inputParams);
                    EngineerImpl engineer = new EngineerImpl(id, soldierFirstName, soldierLastName, engineerSalary, engineerCorps, repairs);

                    if (validCorps(engineer.getCorps())) printSoldier(engineer);
                    break;

                case "Commando": {
                    double commandoSalary = Double.parseDouble(inputParams[4]);

                    String soldierCorps = inputParams[5];
                    List<Mission> missions = getMissions(inputParams);
                    CommandoImpl commando = new CommandoImpl(id, soldierFirstName, soldierLastName, commandoSalary, soldierCorps, missions);

                    if (validCorps(commando.getCorps())) printSoldier(commando);
                    break;

                }
                case "Spy":
                    String soldierCodeNumber = inputParams[4];

                    Spy spy = new SpyImpl(id, soldierFirstName, soldierLastName, soldierCodeNumber);
                    printSoldier(spy);
                    break;

            }

            input = scanner.nextLine();
        }
    }

    private static boolean validCorps(String corps) {
        return !corps.equals("invalid");
    }

    private static <E> void printSoldier(E soldierObject) {
        System.out.println(soldierObject);
    }

    private static List<Mission> getMissions(String[] inputParams) {
        List<Mission> missions = new ArrayList<>();
        for (int i = 6; i < inputParams.length; i += 2) {
            Mission mission = new Mission(inputParams[i], inputParams[i + 1]);
            if (!mission.getState().equals("invalid")) missions.add(mission);
        }
        return missions;
    }

    private static List<Repair> getRepairs(String[] inputParams) {
        List<Repair> repairs = new ArrayList<>();
        for (int i = 6; i < inputParams.length; i += 2) {
            Repair repair = new Repair(inputParams[i], Integer.parseInt(inputParams[i + 1]));
            repairs.add(repair);
        }
        return repairs;
    }

    private static List<PrivateImpl> addLieutenantTeam(List<PrivateImpl> privates, String[] soldiersInfo) {
        List<PrivateImpl> team = new ArrayList<>();
        for (int i = 5; i < soldiersInfo.length; i++) {
            int privateId = Integer.parseInt(soldiersInfo[i]);
            PrivateImpl priv = privates.stream().filter(p -> p.getId() == privateId).findFirst().orElse(null);
            team.add(priv);
        }
        return team;
    }

    private static void addPrivate(int id, String soldierFirstName, String soldierLastName, double soldierSalary, List<PrivateImpl> privates) {
        PrivateImpl priv = new PrivateImpl(id, soldierFirstName, soldierLastName, soldierSalary);
        privates.add(priv);
        System.out.println(priv);
    }
}
