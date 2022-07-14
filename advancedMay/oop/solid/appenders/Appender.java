package SoftUni.advancedMay.oop.solid.appenders;

import SoftUni.advancedMay.oop.solid.MessageLogger;
import SoftUni.advancedMay.oop.solid.layouts.Layout;

public interface Appender {
    void append(String timestamp, MessageLogger.ReportLevel reportLevel, String message);
    Layout getLayout();
    int getMessagesCount();
}
