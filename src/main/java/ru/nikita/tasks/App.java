package ru.nikita.tasks;

import java.util.Random;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {
        show();


    }


    public static void show() {
        Random random1 = new Random();
        Random random2 = new Random();
        Time time = new Time(random1.nextInt(25), random2.nextInt(60), random2.nextInt(60));
        int min = time.getMinutes();
        int sec = time.getSecond();
        if (min < 10) {
            System.out.println("+" + time.getHour() + ":0" + time.getMinutes() + ":" + time.getSecond());
        } else if (sec < 10) {
            System.out.println("+" + time.getHour() + ":" + time.getMinutes() + ":0" + time.getSecond());
        } else if (sec < 10 & min < 10) {
            System.out.println("+" + time.getHour() + ":0" + time.getMinutes() + ":0" + time.getSecond());
        } else {
            System.out.println("+" + time.getHour() + ":" + time.getMinutes() + ":" + time.getSecond());
        }

    }


}
