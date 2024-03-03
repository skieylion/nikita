package ru.nikita.tasks;

public class ColoredRectangle extends Rectangle{
    String color;


    ColoredRectangle(int width, int height, String color) {
        super(width, height);
        this.color = color;
    }
}
