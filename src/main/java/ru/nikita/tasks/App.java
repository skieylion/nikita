package ru.nikita.tasks;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {

        plus(10);

    }

    public static void plus (int x) {
        x += 10;
        System.out.println(x);
    }




}
