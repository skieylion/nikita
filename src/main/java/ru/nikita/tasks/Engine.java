package ru.nikita.tasks;

public class Engine {
    boolean mode;
    double volume;

    int power; // Мощность двигателя
    int cost; // Затраты двигателя n км/л


    void setMode(boolean mode) {
        this.mode = mode;
        if (mode) {
            System.out.println("двигатель запущен");
        } else {
            System.out.println("двигатель остановлен");
        }
    }

    boolean isActive() {
        return mode;
    }

    boolean getStart() {
        mode = true;
        return mode;
    }

    boolean getStop() {
        mode = false;
        return mode;
    }

}
