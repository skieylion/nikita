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

    String getModelCar() {
        model = model + " - " + engine.volume;
        return model;
    }


    void start() {
        if (engine.mode == true) {
            System.out.println("Машина завелась");
        }
    }

    void stop() {
        if (engine.mode == false) {
            System.out.println("Машина не завелась");
        }
    }

    void setSpeed(int speed) {
        if (speed < 200 && speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Скорость за пределами допустимого диапазона");
        }
    }
}

class Engine {


    boolean mode;
    double volume; // Объем двигателя

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

}
