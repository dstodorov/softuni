package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([=|/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;
        while (matcher.find()) {
            String destination = matcher.group("destination");
            destinations.add(destination);
            travelPoints += destination.length();
        }

        System.out.print("Destinations: ");
        for (int i = 0; i < destinations.size(); i++) {
            if (i != destinations.size() - 1) System.out.printf("%s, ", destinations.get(i));
            else System.out.printf("%s", destinations.get(i));
        }
        System.out.printf("%nTravel Points: %d", travelPoints);
    }
}
