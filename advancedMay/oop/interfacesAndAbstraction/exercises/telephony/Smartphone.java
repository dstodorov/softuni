package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        urls.forEach(site -> {
            if (invalidSite(site)) {
                sb.append("Invalid URL!\n");
            } else {
                sb.append("Browsing: ").append(site).append("!\n");
            }
        });
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        numbers.forEach(number -> {
            if (invalidNumber(number)) {
                sb.append("Invalid number!\n");
            } else {
                sb.append("Calling... ").append(number).append("\n");
            }
        });
        return sb.toString().trim();
    }

    private boolean invalidSite(String site) {
        for (int i = 0; i < site.length(); i++) {
            if (Character.isDigit(site.charAt(i))) return true;
        }
        return false;
    }

    private boolean invalidNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) return true;
        }
        return false;
    }
}
