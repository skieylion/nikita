package ru.nikita.tasks;

public class Calculator {

    public static void averageValue(int... value) {
        int add = 0;
        for (int v : value) {
            add += v;
        }
        double mean = add / value.length;
        System.out.println(mean);
    }

}