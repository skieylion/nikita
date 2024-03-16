package ru.nikita.tasks;

public class Cat extends Animal {
    static {
        System.out.println("Animal/Cat_1_staticBlockInint");
    }
    {
        System.out.println("Animal/Cat_3_blockInint");
    }
    Cat() {
        System.out.println("Animal/Cat_4_constructor");
    }

    public void voice() {
        System.out.println("Мяяяяууууу");
    }

}
