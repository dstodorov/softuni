package SoftUni.basics.forLoop.moreExercises;

public class P10Clock2 {
    public static void main(String[] args) {

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.printf("%d : %d : %s%n", h, m, s);
                }
            }
        }
    }
}
