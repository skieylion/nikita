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

    void Ride() {
    }

    String modelCar() {
        model = model + " - " + engine.volume;
        return model;
    }


    void Start() {
        if (engine.mode == true) {
            System.out.println("Машина завелась");
        }
    }

    void Stop() {
        if (engine.mode == false) {
            System.out.println("Машина не завелась");
        }
    }

    void setSpeed(int s) {
        s = 140;
        if (s < 200 && s >= 0) {
            System.out.println("Скорость в норме");
        } else  {
            System.out.println("Speed error");
            }
        }
    }

class Engine {


    boolean mode;
    double volume; // Объем двигателя

    int power; // Мощность двигателя
    int cost; // Затраты двигателя n км/л


    void setMode() {
        if (mode == true) {
            System.out.println("Двигатель запущен");
        } else if (mode == false) {
            System.out.println("Двигатель остановлен");
        }
    }

}
