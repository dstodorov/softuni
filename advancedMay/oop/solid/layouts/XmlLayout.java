package SoftUni.advancedMay.oop.solid.layouts;

import SoftUni.advancedMay.oop.solid.MessageLogger;

public class XmlLayout implements Layout {
    @Override
    public String format(String timestamp, MessageLogger.ReportLevel reportLevel, String message) {
        return String.format(
                "<log>\n" +
                    "\t<date>%s</date>\n" +
                    "\t<level>%s</level>\n" +
                    "\t<message>%s</message>\n" +
                "</log>", timestamp, reportLevel, message
        );
    }
}
