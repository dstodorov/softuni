package SoftUni.fundamentalsJanuary.associativeArrays.lab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] key = new int[]{1, 2, 3, 4, 5, 6};
        //             012345012345012345012345012345012345012
        String text = "Quick brock fox jumps over the red dog";

        for (int i = 0; i < text.length(); i++) {
            int currentKeyIndex = i % key.length;
            System.out.println(text.charAt(i) + " -> " + currentKeyIndex);
        }
    }
}
