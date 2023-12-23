package ru.nikita.tasks;

public class Cube {

    Cube cube;
    double height, width, length;

    Cube(double height, double width, double length) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double getVolume(){
        return height * length *     width;
    }


}
