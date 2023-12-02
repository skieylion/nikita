package ru.nikita.tasks;

import java.util.Random;

public class OperTask8 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(6);
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
        System.out.println(n);

    }
}
