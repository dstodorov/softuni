package SoftUni.advancedMay.advanced.stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s");
        ArrayDeque<String> operatorStack = new ArrayDeque<>();
        ArrayDeque<String> outputQueue = new ArrayDeque<>();

        for (String token : tokens) {
            Pattern numberPattern = Pattern.compile("\\d+");
            Matcher matcher = numberPattern.matcher(token);

            if (matcher.find()) {
                outputQueue.offer(matcher.group());
            }

            Pattern symbolPattern = Pattern.compile("[/+*\\-]");
            matcher = symbolPattern.matcher(token);

            if (matcher.find()) {
                if (operatorStack.isEmpty()) operatorStack.push(matcher.group());
            } else {

            }
        }
    }
}
