package SoftUni.advancedMay.advanced.setsAndMaps.exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, List<String>>> logs = new TreeMap<>();

        Pattern pattern = Pattern.compile("IP=(?<ip>((?:[0-9]{1,3}\\.){3}[0-9]{1,3})|[A-Za-z0-9]{0,4}:[A-Za-z0-9]{0,4}:[A-Za-z0-9]{0,4}:[A-Za-z0-9]{0,4}:[A-Za-z0-9]{0,4}:[A-Za-z0-9]{0,4}:[A-Za-z0-9]{0,4}:[A-Za-z0-9]{0,4}) message='(?<message>.*\\&*.*)' user=(?<username>[A-Za-z0-9]{3,})");
        Matcher matcher;
        while (!input.equals("end")) {
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                String username = matcher.group("username");
                String message = matcher.group("message");
                String ip = matcher.group("ip");

                if (logs.containsKey(username)) {
                    Map<String, List<String>> ips = logs.get(username);
                    if (ips.containsKey(ip)) {
                        ips.get(ip).add(message);
                    } else {
                        List<String> messages = new ArrayList<>();
                        messages.add(message);
                        ips.put(ip, messages);
                    }
                } else {
                    List<String> messages = new ArrayList<>();
                    messages.add(message);
                    Map<String, List<String>> ips = new LinkedHashMap<>();
                    ips.put(ip, messages);
                    logs.put(username, ips);
                }
            }

            input = scanner.nextLine();
        }

        logs.forEach((key, value) -> {
            System.out.println(key + ":");
            int index = 1;
            for (Map.Entry<String, List<String>> ip : value.entrySet()) {
                if (index == value.size()) {
                    System.out.print(ip.getKey() + " => " + ip.getValue().size() + ".");
                } else {
                    System.out.print(ip.getKey() + " => " + ip.getValue().size() + ", ");
                }
                index++;
            }
            System.out.println();
        });
    }
}
