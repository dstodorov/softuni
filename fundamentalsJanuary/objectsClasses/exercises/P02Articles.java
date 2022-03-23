package SoftUni.fundamentalsJanuary.objectsClasses.exercises;

import java.util.Scanner;

public class P02Articles {

    static class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public String getContent() {
            return content;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArticle = scanner.nextLine().split(", ");

        Article article = new Article(inputArticle[0], inputArticle[1], inputArticle[2]);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            String[] inputCommands = scanner.nextLine().split(": ");
            String command = inputCommands[0];

            switch (command) {
                case "Edit":
                    String content = inputCommands[1];
                    article.setContent(content);
                    break;
                case "ChangeAuthor":
                    String author = inputCommands[1];
                    article.setAuthor(author);
                    break;
                case "Rename":
                    String title = inputCommands[1];
                    article.setTitle(title);
                    break;
            }
        }

        System.out.println(article);
    }
}
