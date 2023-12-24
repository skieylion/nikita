package ru.nikita.tasks;

public class Cube {

    double height, width, length;

    Cube(double height, double width, double length) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double getVolume() {
        return height * length * width;
    }

    void setHeight(double height) {
        this.height = height;
    }


}
