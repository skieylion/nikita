package ru.nikita.tasks;

import java.util.Arrays;
import java.util.Optional;

public class MassTask5 {
    public static void main(String[] args) {
        int[][] array5x8 = {
                {3, 2, 5, 6, 44, 43, 1, 4},
                {5, 22, 11, 61, 46, 40, 1, 7},
                {1, 21, 23, 62, 13, 47, 2, 8},
                {9, 29, 41, 63, 15, 75, 3, 12},
                {0, 28, 52, 64, 10, 71, 4, 11}
        };
        int[][] arrayOfMinAndMaxValues = new int[5][2];

        for (int i = 0; i < array5x8.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < array5x8[i].length; j++) {
                max = Math.max(max, array5x8[i][j]);
                min = Math.min(min, array5x8[i][j]);
            }
            arrayOfMinAndMaxValues[i] = new int[]{max, min};
            System.out.println(max + " " + min + " ");
        }

    }


}

