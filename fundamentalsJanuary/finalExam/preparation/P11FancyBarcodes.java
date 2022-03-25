package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P11FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBarcodes = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+$");

        for (int i = 0; i < numberOfBarcodes; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                String productGroup = getProductGroup(matcher.group());
                System.out.printf("Product group: %s%n", productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    private static String getProductGroup(String barcode) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < barcode.length(); i++) {
            if (Character.isDigit(barcode.charAt(i))) sb.append(barcode.charAt(i));
        }

        return sb.length() > 0 ? sb.toString() : "00";
    }
}
