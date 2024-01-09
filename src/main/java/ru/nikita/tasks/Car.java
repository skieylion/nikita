package ru.nikita.tasks;

public class Car {

    Engine engine;

    String colour;
    String number;
    String model;
    int speed;

    Car(Engine engine) {
        this.engine = engine;
    }

    String getModel() {
        return model + " - " + engine.volume;
    }

    void setModel(String model) {
        this.model = model;
        System.out.println("Модель машины - " + model);
    }

    void setNumber(String number) {
        this.number = number;
        System.out.println("Номер машины - " + number);
    }

    void setColour(String colour) {
        this.colour = colour;
        System.out.println("Цвет машины - " + colour);
    }


    void start() {
        engine.start();
        System.out.println("Машина завелась");
    }

    void stop() {
        engine.stop();
        System.out.println("Машина не завелась");
    }

    void setSpeed(int speed) {
        if (speed < 200 && speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Скорость за пределами допустимого диапазона");
        }
    }
}




