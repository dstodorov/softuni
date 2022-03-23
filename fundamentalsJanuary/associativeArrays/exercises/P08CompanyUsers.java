package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyList = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] companyDetails = input.split(" -> ");
            String companyName = companyDetails[0];
            String userId = companyDetails[1];

            if (companyList.containsKey(companyName)) {
                if (!isCompanyHasUser(companyList, companyName, userId)){
                    companyList.get(companyName).add(userId);
                }
            } else {
                List<String> users = new ArrayList<>();
                users.add(userId);
                companyList.put(companyName, users);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> company : companyList.entrySet()) {
            System.out.println(company.getKey());
            for (String user : company.getValue()) {
                System.out.println("-- " + user);
            }
        }
    }

    private static boolean isCompanyHasUser(Map<String, List<String>> companyList, String companyName, String userId) {
        for (String user : companyList.get(companyName)) {
            if (user.equals(userId)) {
                return true;
            }
        }
        return false;
    }
}
