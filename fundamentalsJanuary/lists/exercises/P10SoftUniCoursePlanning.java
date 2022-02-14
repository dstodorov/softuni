package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("course start")) {
            String[] rawCommand = inputCommand.split(":");

            List<String> lessons = new ArrayList<>();

            String lessonTitle = rawCommand[1];
            String formattedExerciseName = String.format("%s-%s", lessonTitle, "Exercise");

            lessons.add(lessonTitle);

            if (rawCommand[0].equals("Add")) {
                if (!isLessonsExist(schedule, lessons)) {
                    schedule.add(lessonTitle);
                }
            } else if (rawCommand[0].equals("Insert")) {
                int index = Integer.parseInt(rawCommand[2]);
                if (!isLessonsExist(schedule, lessons)) {
                    schedule.add(index, lessonTitle);
                }
            } else if (rawCommand[0].equals("Remove")) {
                if (isLessonsExist(schedule, lessons)) {
                    schedule.remove(lessonTitle);
                    if (isExerciseExist(schedule, lessonTitle)) {
                        schedule.remove(formattedExerciseName);
                    }

                }
            } else if (rawCommand[0].equals("Swap")) {
                String lessonTitleTwo = rawCommand[2];
                lessons.add(lessonTitleTwo);
                if (isLessonsExist(schedule, lessons)) {
                    swapLessons(schedule, lessons);
                }
            } else if (rawCommand[0].equals("Exercise")) {

                if (isLessonsExist(schedule, lessons)) {
                    if (!isExerciseExist(schedule, lessonTitle)) {
                        int index = schedule.lastIndexOf(lessonTitle);
                        addExercise(schedule, formattedExerciseName, index + 1);
                    }
                } else {
                    schedule.add(lessonTitle);
                    addExercise(schedule, formattedExerciseName);
                }
            }
            inputCommand = scanner.nextLine();
        }

        printSchedule(schedule);
    }

    private static void printSchedule(List<String> schedule) {
        for (int i = 0; i < schedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, schedule.get(i));
        }
    }

    private static void addExercise(List<String> schedule, String exercise) {
        addExercise(schedule, exercise, schedule.size());
    }

    private static void addExercise(List<String> schedule, String exercise, int index) {
        schedule.add(index, exercise);
    }

    private static boolean isExerciseExist(List<String> schedule, String lesson) {
        String formattedExercise = String.format("%s-%s", lesson, "Exercise");
        return schedule.contains(formattedExercise);
    }

    private static void swapLessons(List<String> schedule, List<String> lessons) {
        String exerciseOneFormattedValue = String.format("%s-Exercise", lessons.get(0));
        String exerciseTwoFormattedValue = String.format("%s-Exercise", lessons.get(1));

        int lessonOneIndex = schedule.indexOf(lessons.get(0));
        int lessonTwoIndex = schedule.indexOf(lessons.get(1));
        List<String> tempSchedule = new ArrayList<>();

        for (int i = 0; i < schedule.size(); i++) {
            if (i == lessonOneIndex) {
                tempSchedule.add(lessons.get(1));
                if (schedule.contains(exerciseTwoFormattedValue)) {
                    tempSchedule.add(exerciseTwoFormattedValue);
                }
            } else if (i == lessonTwoIndex) {
                tempSchedule.add(lessons.get(0));
                if (schedule.contains(exerciseOneFormattedValue)) {
                    tempSchedule.add(exerciseOneFormattedValue);
                }
            } else {
                if (!schedule.get(i).equals(exerciseOneFormattedValue) && !schedule.get(i).equals(exerciseTwoFormattedValue)) {
                    tempSchedule.add(schedule.get(i));
                }
            }
        }

        schedule.clear();
        schedule.addAll(tempSchedule);

    }


    private static boolean isLessonsExist(List<String> schedule, List<String> lessons) {
        boolean exist = false;
        for (String lesson : lessons) {
            if (schedule.contains(lesson)) exist = true;
        }
        return exist;
    }
}
