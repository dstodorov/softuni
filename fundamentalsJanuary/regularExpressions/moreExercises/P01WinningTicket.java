package SoftUni.fundamentalsJanuary.regularExpressions.moreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tickets = scanner.nextLine();
        Pattern pattern = Pattern.compile("[^,\\s+]+");
        Matcher matcher = pattern.matcher(tickets);

        while (matcher.find()) {
            String ticket = matcher.group();

            if (ticket.length() == 20) {
                String leftHalf = ticket.substring(0, 10);
                String rightHalf = ticket.substring(10);

                Pattern validTickerPattern = Pattern.compile("(\\${6,10}|@{6,10}|#{6,10}|\\^{6,10})");
                Matcher validLeftTicketMatcher = validTickerPattern.matcher(leftHalf);
                Matcher validRightTicketMatcher = validTickerPattern.matcher(rightHalf);
                if (validLeftTicketMatcher.find() && validRightTicketMatcher.find()) {
                    boolean hasJackpot = validLeftTicketMatcher.group().length() == 10 && validRightTicketMatcher.group().length() == 10;
                    boolean hasWinningTicket = validLeftTicketMatcher.group().length() > 6
                            //&& validLeftTicketMatcher.group().length() < 10
                            && validRightTicketMatcher.group().length() > 6;
                            //&& validRightTicketMatcher.group().length() < 10;
                    if (hasJackpot) {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", ticket, validLeftTicketMatcher.group().length(), validLeftTicketMatcher.group().charAt(0));
                    } else if (hasWinningTicket) {
                        System.out.printf("ticket \"%s\" - %d%s%n", ticket, validLeftTicketMatcher.group().length(), validLeftTicketMatcher.group().charAt(0));
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
