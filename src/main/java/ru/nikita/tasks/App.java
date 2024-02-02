package ru.nikita.tasks;

import static java.awt.AWTEventMulticaster.add;

public class App {


    public static final double PI = 3.14;

    static int counter = 0;

    public static void main(String[] args) {
        Car car = new Car();
        plus(car);
        System.out.println(car.value);
    }

    public static void plus(Car car) {
        car.value = 4;
    }


}
