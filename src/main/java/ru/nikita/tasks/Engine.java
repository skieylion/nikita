package ru.nikita.tasks;

public class Engine {

    Engine engine;
    boolean active;
    double volume;

    int power; // Мощность двигателя
    int cost; // Затраты двигателя n км/л

    Engine() {
        engine = new Engine();
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
