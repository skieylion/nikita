package ru.nikita.tasks;

import java.util.Arrays;
import java.util.Optional;

public class MassTask5 {
    public static void main(String[] args) {
        int[][] MasMay = new int[5][8];
        for (int i = 0; i < MasMay.length; i++) {
            for (int j = 0; j < MasMay[i].length; j++) {
                MasMay[i][j] = (i) + (j + 1);
                System.out.print(MasMay[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();

        int[][] May = new int[5][2];
        int[] MinV = Arrays.stream(MasMay)
                .mapToInt(row -> Arrays.stream(row).min().orElse(0))
                .toArray();
        int[] MaxV = Arrays.stream(MasMay)
                .mapToInt(row -> Arrays.stream(row).max().orElse(0))
                .toArray();
        System.out.println(Arrays.toString(MinV) + " - MinValue");
        System.out.println(Arrays.toString(MaxV) + " - MaxValue");
    }
}

