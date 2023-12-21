package ru.nikita.tasks;

public class CarFiller {
    Car car;

    CarFiller() {
        car = new Car();
    }

    void fillCar(Car car) {
        car.setModel("BMW");
        car.setNumber("SA89S");
        car.colour = "Blue";
        car.setSpeed(199);
    }
}
