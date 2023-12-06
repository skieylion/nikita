package ru.nikita.tasks;

import java.util.Random;

public class OperTask8 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(8);
        int x = 1;

        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        System.out.println(x);
        System.out.println(n);
    }
}
