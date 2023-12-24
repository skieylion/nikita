package ru.nikita.tasks;

import java.util.Random;

public class Cube {



    static Square square = new Square(1, 2);

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

    public static void cubeOfSquareAndHeight(double width, double length, Random height) {
        Random random = new Random(1000);
        width = square.width;
        length = square.length;
        height = random;
    }


}
