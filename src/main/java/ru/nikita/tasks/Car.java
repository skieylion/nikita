package ru.nikita.tasks;

public class Car {
    private static int count = 0;

    Car() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
