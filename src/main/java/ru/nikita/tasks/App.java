package ru.nikita.tasks;

import java.util.Random;

import static java.awt.AWTEventMulticaster.add;

public class App {

    static void print(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("Я тигр");
        } else if (animal instanceof Dog) {
            System.out.println("Я Собака");
        } else if (animal instanceof Cat) {
            System.out.println("Я Кот");
        }
    }

    public static void main(String[] args) {


        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();


        int n = 51;
        Animal[] animals = new Animal[n];
        for (int i = 0; i < animals.length; i++) {
            int random = new Random().nextInt(100);
            if (random <= 34) {
                animals[i] = cat;
            } else if (random >= 65) {
                animals[i] = tiger;
            } else {
                animals[i] = dog;
            }
            print(animals[i]);
        }
    }


}



