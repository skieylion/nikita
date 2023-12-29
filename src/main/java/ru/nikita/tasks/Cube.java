package ru.nikita.tasks;

public class Cube {


    Square square;

    CubeHeight cuhei = new CubeHeight();

    double height, width, length;

    Cube(double height, double width, double length) {
        square = new Square();
        this.height = height;
        this.length = length;
        this.width = width;

    }

    double getVolume() {
        return height * length * width;
    }

    public void cubeOfSquareAndHeight(double width, double length, double height) {
        width = square.getWidth();
        length = square.getLength();
        height = cuhei.getHeight();
    }


}
