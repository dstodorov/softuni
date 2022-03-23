package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("end")) {
            String[] courseDetails = inputCommand.split(" : ");
            String courseName = courseDetails[0];
            String student = courseDetails[1];

            if (courses.containsKey(courseName)) {
                courses.get(courseName).add(student);
            } else {
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(student);
            }
            inputCommand = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> course : courses.entrySet()) {
            System.out.println(course.getKey() + ": " + course.getValue().size());
            for(String student : course.getValue()) {
                System.out.println("-- " + student);
            }
        }
    }
}
