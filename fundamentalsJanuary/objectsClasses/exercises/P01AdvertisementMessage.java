package SoftUni.fundamentalsJanuary.objectsClasses.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {
    static class Message {
        private String[] phrases;
        private String[] events;
        private String[] authors;
        private String[] cities;

        private String phrase;
        private String event;
        private String author;
        private String city;

        private Random random;

        Message(String phrase, String event, String author, String city) {
            this.phrase = phrase;
            this.event = event;
            this.author = author;
            this.city = city;
        }

        Message() {
            phrases = new String[]{
                    "Excellent product.",
                    "Such a great product.",
                    "I always use that product.",
                    "Best product of its category.",
                    "Exceptional product.",
                    "I can’t live without this product."
            };

            events = new String[]{
                    "Now I feel good.",
                    "I have succeeded with this product.",
                    "Makes miracles. I am happy of the results!",
                    "I cannot believe but now I feel awesome.",
                    "Try it yourself, I am very satisfied.",
                    "I feel great!"
            };

            authors = new String[]{
                    "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"
            };

            cities = new String[]{
                    "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"
            };

            random = new Random();

        }

        String getRandomPhrase() {
            return this.phrases[this.random.nextInt(this.phrases.length)];
        }

        String getRandomEvent() {
            return this.events[this.random.nextInt(this.events.length)];
        }

        String getRandomAuthor() {
            return this.authors[this.random.nextInt(this.authors.length)];
        }

        String getRandomCity() {
            return this.cities[this.random.nextInt(this.cities.length)];
        }

        void printMessage() {
            String message = String.format("%s %s %s - %s", this.phrase, this.event, this.author, this.city);
            System.out.println(message);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Message> messages = new ArrayList<>();

        int messageCount = Integer.parseInt(scanner.nextLine());
        Message msg = new Message();

        for (int i = 0; i < messageCount; i++) {
            String phrase = msg.getRandomPhrase();
            String event = msg.getRandomEvent();
            String author = msg.getRandomAuthor();
            String city = msg.getRandomCity();

            messages.add(new Message(phrase, event, author, city));
        }

        printMessages(messages);
    }

    private static void printMessages(List<Message> messages) {
        for (Message msg : messages) {
            msg.printMessage();
        }
    }
}
