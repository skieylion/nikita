package ru.nikita.tasks;

import java.util.Random;

public class Time {

    int hour;
    int minutes;
    int second;

    Time(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    Time(int hour) {
        this.hour = hour;
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


}

