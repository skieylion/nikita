package ru.nikita.tasks;

public class Engine {

    boolean active;
    double volume;

    int power;
    int consumption; // Затраты двигателя n км/л

    Engine(double volume, int power, int consumption, boolean active) {
        this.active = active;
        this.power = power;
        this.consumption = consumption;
        this.volume = volume;
    }


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
        setActive(true);
    }

    void stop() {
        setActive(false);
    }

}
