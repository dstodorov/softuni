package SoftUni.fundamentalsJanuary.objectsClasses.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ArticlesTwo {
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

        int commandsCount = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < commandsCount; i++) {
            String[] inputCommands = scanner.nextLine().split(", ");
            String title = inputCommands[0];
            String content = inputCommands[1];
            String author = inputCommands[2];

            articles.add(new Article(title, content, author));
        }

        String sortCriteria = scanner.next();
        List<Article> sorted = new ArrayList<>();
        if (sortCriteria.equals("title")) {
            sorted = articles.stream().sorted(Comparator.comparing(Article::getTitle)).collect(Collectors.toList());
        } else if (sortCriteria.equals("content")) {
            sorted = articles.stream().sorted(Comparator.comparing(Article::getContent)).collect(Collectors.toList());
        } else if (sortCriteria.equals("author")) {
            sorted = articles.stream().sorted(Comparator.comparing(Article::getAuthor)).collect(Collectors.toList());
        }

        for (Article a : sorted) {
            System.out.println(a);
        }
    }
}
