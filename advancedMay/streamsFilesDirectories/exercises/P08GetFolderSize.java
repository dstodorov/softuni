package SoftUni.advancedMay.streamsFilesDirectories.exercises;

import java.io.File;

public class P08GetFolderSize {
    public static void main(String[] args) {

        File folder = new File("D:\\Files-and-streams\\Exercises Resources");

        long folderSize = getFolderSize(folder);

        System.out.println("Folder size: " + folderSize);
    }

    private static long getFolderSize(File folder) {
        File[] listOfFiles = folder.listFiles();
        int count = listOfFiles != null ? listOfFiles.length : 0;
        long size = 0;
        for (int i = 0; i < count; i++) {
            if(listOfFiles[i].isFile()) {
                size += listOfFiles[i].length();
            } else {
                size += getFolderSize(listOfFiles[i]);
            }
        }
        return size;
    }
}
