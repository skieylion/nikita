package ru.nikita.tasks;

public class EngineFiller {
    Engine engine;

    EngineFiller() {
        engine = new Engine();
    }

    void fillEngine(Engine engine) {
        engine.volume = 3.999;
        engine.cost = 22;
        engine.power = 420;
        engine.setActive(true);

    }

}
