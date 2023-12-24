package ru.nikita.tasks;

import java.util.Scanner;

public class Circle {
    public static final double Pi = 3.14;

    static Double radius;

    double getArea () {
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        return  Pi * radius * radius;
    }
}
