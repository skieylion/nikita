package ru.nikita.tasks;

public class Car {

    Engine engine = new Engine();

    String colour;
    String number;
    String model;
    int speed;
    void Ride() {
    }
    String ModelCar() {
        model = model + " - " + engine.volume;
        return model;
    }
    void StartOrStop() {
        if (engine.mode == true) {
            System.out.println("Машина завелась");
        } else {
            System.out.println("Машина не завелась");
        }
    }
    void setSpeed() {
        if (speed <= 200) {
            System.out.println();
        } else {
            while (speed > 200) {
                speed--;
            }
        }
    }
}
class Engine {



    boolean mode;
    double volume; // Объем двигателя

    int power; // Мощность двигателя
    int cost; // Затраты двигателя n км/л


    void Start() {
        mode = true;
    }

    void Stop() {
        mode = false;
    }

}
