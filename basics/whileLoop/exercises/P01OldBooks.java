package SoftUni.basics.whileLoop.exercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int booksChecked = 0;

        while (true) {
            String currentBook = scanner.nextLine();

            if (currentBook.equals(bookName)) {
                System.out.printf("You checked %d books and found it.", booksChecked);
                break;
            }
            if (currentBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", booksChecked);
                break;
            }
            booksChecked++;
        }
    }
}
