package ru.nikita.tasks;

public class Cube {
    double height, width, length;

    Cube(double height, double width, double length) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void volume(double volume){
        volume = height * length * width;
    }
}
