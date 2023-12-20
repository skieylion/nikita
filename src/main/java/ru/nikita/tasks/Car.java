package ru.nikita.tasks;

public class Car {


    Engine engine;
    String colour;
    String number;
    String model;
    int speed;

    Car() {
        engine = new Engine();
    }

    String getModel() {
        return model + " - " + engine.volume;
    }

    void setModel(String model, String number) {
        this.model = model;
        this.number = number;
        System.out.println(model + " - С номером машины - " + number);
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




