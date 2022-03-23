package SoftUni.fundamentalsJanuary.objectsClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int songCount = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        getSongDetails(scanner, songCount, songs);

        String favTypeList = scanner.nextLine();

        if (favTypeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(favTypeList)) {
                    System.out.println(song.getName());
                }
            }
        }


    }

    private static void getSongDetails(Scanner scanner, int songCount, List<Song> songs) {
        for (int i = 0; i < songCount; i++) {
            String[] input = scanner.nextLine().split("_");

            String typeList = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song();
            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }
    }
}

class Song {
    private String typeList;
    private String name;
    private String time;

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
