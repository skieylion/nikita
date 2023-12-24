package ru.nikita.tasks;

public class App {
    public static void main(String[] args) {
        Cube cube = new Cube(1, 1, 1);
        cube.width = 2;
        cube.setHeight(3);
        System.out.println(cube.getVolume());
    }

}
