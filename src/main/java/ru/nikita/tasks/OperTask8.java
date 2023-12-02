package ru.nikita.tasks;

import java.util.Random;

public class OperTask8 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(6);
        int x = 1;

        for (int i = 0; i < n; i++) {
            x *= i;
        }
        System.out.println(n);
    }
}
