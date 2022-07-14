package SoftUni.advancedMay.oop.solid.layouts;

import SoftUni.advancedMay.oop.solid.MessageLogger;

public interface Layout {
    public String format(String timestamp, MessageLogger.ReportLevel reportLevel, String message);
}
