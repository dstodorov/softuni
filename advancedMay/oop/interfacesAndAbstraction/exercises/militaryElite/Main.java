package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.militaryElite;

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
                    try{
                        Engineer engineer = new EngineerImpl(id, soldierFirstName, soldierLastName, soldierSalary, soldierCorps, repairs);
                        System.out.println(engineer);
                    } catch (IllegalArgumentException e) {
                        //continue;
                    }

                    break;
                }
                case "Commando": {
                    double soldierSalary = Double.parseDouble(inputParams[4]);
                    String soldierCorps = inputParams[5];
                    List<Mission> missions = new ArrayList<>();
                    for (int i = 6; i < inputParams.length; i += 2) {
                        try {
                            Mission mission = new Mission(inputParams[i], inputParams[i + 1]);
                            missions.add(mission);
                        } catch (IllegalArgumentException e) {

                        }

                    }
                    try{
                        Commando commando = new CommandoImpl(id, soldierFirstName, soldierLastName, soldierSalary, soldierCorps, missions);
                        System.out.println(commando);
                    } catch (IllegalArgumentException e) {

                    }
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
