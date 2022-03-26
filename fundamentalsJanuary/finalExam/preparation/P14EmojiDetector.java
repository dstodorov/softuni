package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P14EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int validEmojis = 0;
        List<String> emojis = new ArrayList<>();
        int coolThreshold = getCoolThreshold(text);

        Pattern pattern = Pattern.compile("([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            validEmojis++;
            int emojiThreshold = getEmojiCoolThreshold(matcher.group("emoji"));
            if (emojiThreshold > coolThreshold) emojis.add(matcher.group());
        }

        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", validEmojis);
        for (String emoji : emojis) {
            System.out.println(emoji);
        }
    }

    private static int getCoolThreshold(String text) {
        int sum = 1;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                sum *= Integer.parseInt(String.valueOf(text.charAt(i)));
            }
        }
        return sum;
    }

    private static int getEmojiCoolThreshold(String emoji) {
        int sum = 0;
        for (int i = 0; i < emoji.length(); i++) {
            sum += emoji.charAt(i);
        }
        return sum;
    }
}
