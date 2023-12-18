package ru.nikita.tasks;

public class Engine {
    boolean active;
    double volume;

    int power; // Мощность двигателя
    int cost; // Затраты двигателя n км/л


    void setActive(boolean active) {
        this.active = active;
        if (active) {
            System.out.println("двигатель запущен");
        } else {
            System.out.println("двигатель остановлен");
        }
    }

    boolean isActive() {
        return active;
    }

    void start() {
        this.active = true;
        System.out.println("двигатель запустился");
    }

    void stop() {
        this.active = false;
        System.out.println("двигатель запустился");
    }

}
