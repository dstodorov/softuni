package SoftUni.advancedMay.oop.solid;

import SoftUni.advancedMay.oop.solid.appenders.Appender;
import SoftUni.advancedMay.oop.solid.appenders.FileAppender;

import java.util.Map;

public class MessageLogger implements Logger {

    public enum ReportLevel {
        INFO,
        WARNING,
        ERROR,
        CRITICAL,
        FATAL;
    }

    private Map<Appender, ReportLevel> appenders;

    public MessageLogger(Map<Appender, ReportLevel> appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logInfo(String timestamp, String message) {
        callAppenders(timestamp, ReportLevel.INFO, message);
    }


    @Override
    public void logWarning(String timestamp, String message) {
        callAppenders(timestamp, ReportLevel.WARNING, message);
    }

    @Override
    public void logError(String timestamp, String message) {
        callAppenders(timestamp, ReportLevel.ERROR, message);
    }

    @Override
    public void logCritical(String timestamp, String message) {
        callAppenders(timestamp, ReportLevel.CRITICAL, message);

    }

    @Override
    public void logFatal(String timestamp, String message) {
        callAppenders(timestamp, ReportLevel.FATAL, message);
    }

    private void callAppenders(String timestamp, ReportLevel reportLevel, String message) {
        for (Map.Entry<Appender, ReportLevel> entry : this.appenders.entrySet()) {
            Appender appender = entry.getKey();
            ReportLevel currentAppenderReportLevel = entry.getValue();

            if (reportLevel.ordinal() >= currentAppenderReportLevel.ordinal()) {
                appender.append(timestamp, reportLevel, message);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append("Logger info").append(System.lineSeparator());
        this.appenders.forEach((appender, reportLevel) -> {
            output.append("Appender type: ").append(appender.getClass().getSimpleName());
            output.append(", Layout type: ").append(appender.getLayout().getClass().getSimpleName());
            output.append(", Report level: ").append(reportLevel.toString());
            output.append(", Messages appended: ").append(appender.getMessagesCount());
            if (appender instanceof FileAppender) {
                output.append(", File size: ").append(((FileAppender) appender).getFile().getSize());
            }
            output.append(System.lineSeparator());
        });

        return output.toString().trim();
    }
}
