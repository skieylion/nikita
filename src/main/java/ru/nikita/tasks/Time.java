package ru.nikita.tasks;

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
    int plus(int p) {
        this.minutes += p;
        return minutes;
    }
    int minus(int m) {
        this.minutes -= m;
        return minutes;
    }
}
