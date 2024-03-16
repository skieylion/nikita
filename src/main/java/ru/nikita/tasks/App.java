package ru.nikita.tasks;

import java.util.Random;

import static java.awt.AWTEventMulticaster.add;

public class App {

    public static void main(String[] args) {


        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        cat.voice();
    }


}



