package ru.nikita.tasks;

public class CarFiller {

    Car car;
    Engine engine;

    CarFiller() {
        car = new Car();
        engine = new Engine();
    }

    void fillCar(Car car) {
        car.setModel("BMW", "SP827S");
        car.colour = "Blue";
        car.setSpeed(199);
    }

    void fillEngine(Engine engine) {
        engine.volume = 3.999;
        engine.cost = 22;
        engine.power = 420;
        engine.setActive(true);

    }
}
