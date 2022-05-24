package SoftUni.advancedMay.streamsFilesDirectories.lab;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P08NestedFolders {
    public static void main(String[] args) {
        File rootDirectory = new File("D:\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (rootDirectory.exists() && rootDirectory.isDirectory()) {
            System.out.println(rootDirectory.getName());
            List<Integer> counter = new ArrayList<>();
            counter.add(1);

            printFolders(rootDirectory, counter);
            System.out.println(counter.get(0));
        }
    }

    private static void printFolders(File rootDirectory, List<Integer> counter) {
        File[] files = rootDirectory.listFiles();
        System.out.println(rootDirectory.getName());
        for (File file : files) {
            if (file.isDirectory()) {
                counter.set(0, counter.get(0) + 1);
                printFolders(file.getAbsoluteFile(), counter);
            }
        }
    }
}
