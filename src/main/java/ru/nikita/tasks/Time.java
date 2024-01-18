package ru.nikita.tasks;

import java.util.Random;

public class Time {

    int hour;
    int minutes;
    int second;

    Time(int h, int m, int s) {
        this.hour = h;
        this.minutes = m;
        this.second = s;
    }

    Time(int h, int m) {
        this.hour = h;
        this.minutes = m;
    }

    Time(int h) {
        this.hour = h;
    }

    int getHour() {
        return hour;
    }

    int getMinutes() {
        return minutes;
    }

    int getSecond() {
        return second;
    }


    int plus(int p) {
        this.minutes += p;
        return minutes;
    }

    int substruct(int substruct) {
        this.minutes -= substruct;
        return minutes;
    }

    void time() {
        int min = getMinutes();
        int sec = getSecond();
        if (min < 10) {
            System.out.println("+" + getHour() + ":0" + getMinutes() + ":" + getSecond());
        } else if (sec < 10) {
            System.out.println("+" + getHour() + ":" + getMinutes() + ":0" + getSecond());
        } else if (sec < 10 & min < 10) {
            System.out.println("+" + getHour() + ":0" + getMinutes() + ":0" + getSecond());
        } else {
            System.out.println("+" + getHour() + ":" + getMinutes() + ":" + getSecond());
        }
    }
}

