package SoftUni.fundamentalsJanuary.Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] initialPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] field = new int[fieldSize];

        for (int currentIndex : initialPositions) {
            if (currentIndex >= 0 && currentIndex < field.length) {
                field[currentIndex] = 1;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] clearCommand = command.split(" ");

            int ladybug = Integer.parseInt(clearCommand[0]);
            String direction = clearCommand[1];
            int flyLength = Integer.parseInt(clearCommand[2]);

            boolean skip = ladybug < 0 || ladybug > field.length - 1 || field[ladybug] == 0;

            if (!skip) {
                field[ladybug] = 0;

                if (direction.equals("right")) {
                    int index = ladybug + flyLength;

                    if (index > field.length - 1) {
                        continue;
                    }

                    if (field[index] == 1) {
                        while (field[index] == 1) {
                            index += flyLength;
                            if (index > field.length - 1) {
                                break;
                            }
                        }
                    }
                    if (index <= field.length - 1) {
                        field[index] = 1;
                    }
                } else if (direction.equals("left")) {
                    int index = ladybug - flyLength;

                    if (index < 0) {
                        continue;
                    }

                    if (field[index] == 1) {
                        while (field[index] == 1) {
                            index -= flyLength;
                            if (index < 0) {
                                break;
                            }
                        }
                    }
                    if (index >= 0 && index <= field.length - 1) {
                        field[index] = 1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.stream(field).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
