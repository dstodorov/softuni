package SoftUni.advancedMay.oop.solid.appenders;

import SoftUni.advancedMay.oop.solid.MessageLogger;
import SoftUni.advancedMay.oop.solid.layouts.Layout;

public class ConsoleAppender  extends BaseAppender{
    private Layout layout;

    public ConsoleAppender(Layout layout) {
        super(layout);
        this.layout = layout;
    }


    @Override
    public void append(String timestamp, MessageLogger.ReportLevel reportLevel, String message) {
        numberOfMessages++;
        System.out.println(this.layout.format(timestamp, reportLevel, message));
    }
}
