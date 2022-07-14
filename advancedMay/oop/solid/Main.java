package SoftUni.advancedMay.oop.solid;

import SoftUni.advancedMay.oop.solid.appenders.Appender;
import SoftUni.advancedMay.oop.solid.appenders.ConsoleAppender;
import SoftUni.advancedMay.oop.solid.appenders.FileAppender;
import SoftUni.advancedMay.oop.solid.files.LogFile;
import SoftUni.advancedMay.oop.solid.layouts.Layout;
import SoftUni.advancedMay.oop.solid.layouts.SimpleLayout;
import SoftUni.advancedMay.oop.solid.layouts.XmlLayout;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfAppenders = Integer.parseInt(scanner.nextLine());

        Map<Appender, MessageLogger.ReportLevel> appenders = new LinkedHashMap<>();


        while (numberOfAppenders-- > 0) {
            String[] inputDetails = scanner.nextLine().split("\\s+");

            String appenderType = inputDetails[0];
            String layoutType = inputDetails[1];
            MessageLogger.ReportLevel reportLevel = MessageLogger.ReportLevel.INFO;

            if (inputDetails.length == 3) {
                reportLevel = MessageLogger.ReportLevel.valueOf(inputDetails[2]);
            }

            Layout layout = getLayout(layoutType);
            appenders.put(getAppender(appenderType, layout), reportLevel);
        }

        String input = scanner.nextLine();

        Logger logger = new MessageLogger(appenders);

        while (!input.equals("END")) {
            String[] inputDetails = input.split("\\|");

            MessageLogger.ReportLevel reportLevel = MessageLogger.ReportLevel.valueOf(inputDetails[0]);
            String timestamp = inputDetails[1];
            String message = inputDetails[2];

            switch (reportLevel) {
                case INFO -> logger.logInfo(timestamp, message);
                case WARNING -> logger.logWarning(timestamp, message);
                case ERROR -> logger.logError(timestamp, message);
                case CRITICAL -> logger.logCritical(timestamp, message);
                case FATAL -> logger.logFatal(timestamp, message);
            }

            input = scanner.nextLine();
        }

        System.out.println(logger);
    }

    private static Appender getAppender(String appenderType, Layout layout) {
        return switch (appenderType) {
            case "ConsoleAppender" -> new ConsoleAppender(layout);
            case "FileAppender" -> new FileAppender(layout, new LogFile());
            default -> null;
        };
    }

    private static Layout getLayout(String layoutType) {
        return switch (layoutType) {
            case "SimpleLayout" -> new SimpleLayout();
            case "XmlLayout" -> new XmlLayout();
            default -> null;
        };
    }
}
