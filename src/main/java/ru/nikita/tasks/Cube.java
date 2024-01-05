package ru.nikita.tasks;

public class Cube {

    double side;

    Cube(double side) {
        this.side = side;
    }

    double getVolume() {
        return side * side * side;
    }

    public static Cube cubeOfSquare(double side) {
        Square square = new Square();
        return new Cube(square.getSide());
    }


}
