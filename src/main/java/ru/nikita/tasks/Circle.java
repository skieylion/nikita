package ru.nikita.tasks;

import java.util.Scanner;

public class Circle {
    public static final double PI = 3.14;

    double radius;

    double getArea() {
        return PI * radius * radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}
