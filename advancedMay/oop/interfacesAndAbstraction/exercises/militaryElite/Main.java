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
                case "Private": {
                    double soldierSalary = Double.parseDouble(inputParams[4]);
                    PrivateImpl priv = new PrivateImpl(id, soldierFirstName, soldierLastName, soldierSalary);
                    privates.add(priv);
                    System.out.println(priv);
                    break;
                }
                case "LieutenantGeneral": {
                    double soldierSalary = Double.parseDouble(inputParams[4]);
                    List<PrivateImpl> team = new ArrayList<>();
                    for (int i = 5; i < inputParams.length; i++) {
                        int privateId = Integer.parseInt(inputParams[i]);
                        PrivateImpl priv = privates.stream().filter(p -> p.getId() == privateId).findFirst().orElse(null);
                        team.add(priv);
                    }
                    LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, soldierFirstName, soldierLastName, soldierSalary, team);
                    System.out.println(lieutenantGeneral);
                    break;
                }
                case "Engineer": {
                    double soldierSalary = Double.parseDouble(inputParams[4]);
                    String soldierCorps = inputParams[5];
                    List<Repair> repairs = new ArrayList<>();
                    for (int i = 6; i < inputParams.length; i += 2) {
                        Repair repair = new Repair(inputParams[i], Integer.parseInt(inputParams[i + 1]));
                        repairs.add(repair);
                    }
                    EngineerImpl engineer = new EngineerImpl(id, soldierFirstName, soldierLastName, soldierSalary, soldierCorps, repairs);
                    if (!engineer.getCorps().equals("invalid")) System.out.println(engineer);
                    break;
                }
                case "Commando": {
                    double soldierSalary = Double.parseDouble(inputParams[4]);
                    String soldierCorps = inputParams[5];
                    List<Mission> missions = new ArrayList<>();
                    for (int i = 6; i < inputParams.length; i += 2) {
                        Mission mission = new Mission(inputParams[i], inputParams[i + 1]);
                        if (!mission.getState().equals("invalid")) missions.add(mission);
                    }

                    CommandoImpl commando = new CommandoImpl(id, soldierFirstName, soldierLastName, soldierSalary, soldierCorps, missions);
                    if (!commando.getCorps().equals("invalid")) System.out.println(commando);
                    break;
                }
                case "Spy": {
                    String soldierCodeNumber = inputParams[4];
                    Spy spy = new SpyImpl(id, soldierFirstName, soldierLastName, soldierCodeNumber);
                    System.out.println(spy);
                    break;
                }

            }

            input = scanner.nextLine();
        }
    }
}
