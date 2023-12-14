package ru.nikita.tasks;

import java.util.Scanner;

public class Car {
    String colour;

    String number;

    int model;

    int speed;

    void Ride() {

    }

    void Start() {

    }

    void Stop() {
    }

    void setSpeed() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            speed = 1;
        } else if (a == 2) {
            speed = 2;
        } else if (a == -1) {
            speed = -1;
        }
    }
}

class Engine {

    int mode;
    double volume;

    int power;
    int cost;


    void Start() {
        mode = 1;
    }

    void Stop() {
        mode = 0;
    }

}
