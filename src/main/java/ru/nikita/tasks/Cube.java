package ru.nikita.tasks;

public class Cube {

    double side;

    private Cube(double side) {
        this.side = side;
    }

    double getVolume() {
        return side * side * side;
    }

   public static Cube cubeOfSquare(Square square) {
       return new Cube(square.getSide());
    }
}
