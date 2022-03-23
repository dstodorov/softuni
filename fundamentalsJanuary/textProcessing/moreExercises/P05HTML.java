package SoftUni.fundamentalsJanuary.textProcessing.moreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        String input = scanner.nextLine();

        List<String> comments = new ArrayList<>();
        StringBuilder outputHtml = new StringBuilder();

        while (!input.equals("end of comments")) {
            String comment = input;
            comments.add(comment);
            input = scanner.nextLine();
        }

        outputHtml.append("<h1>\n").append("\t").append(title).append("\n</h1>\n");
        outputHtml.append("<article>\n").append("\t").append(content).append("\n</article>\n");

        for (String comment : comments) {
            outputHtml.append("<div>\n").append("\t").append(comment).append("\n</div>\n");
        }
        System.out.println(outputHtml);
    }
}
