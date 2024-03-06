package ru.nikita.tasks;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.voice();
        dog.voice();


    }
}



