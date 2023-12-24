package ru.nikita.tasks;

public class Circle {
    public static final double Pi = 3.14;

    static double radius;

    double getArea () {
        return  Pi * radius * radius;
    }
}
