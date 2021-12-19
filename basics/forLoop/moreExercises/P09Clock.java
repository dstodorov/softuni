package SoftUni.basics.forLoop.moreExercises;

public class P09Clock {
    public static void main(String[] args) {

        for (int h = 0; h < 24; h ++) {
            for (int m = 0; m <= 59; m++) {
                System.out.printf("%d : %d%n", h, m);
            }
        }
    }
}
