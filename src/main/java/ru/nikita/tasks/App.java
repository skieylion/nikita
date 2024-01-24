package ru.nikita.tasks;

import java.util.Arrays;
import java.util.Random;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Queue queue = new Queue(random.nextInt(10));
        queue.push(random.nextInt(10));
        queue.push(random.nextInt(10));
        queue.push(random.nextInt(10));
        queue.push(random.nextInt(10));
        queue.pop();


    }

}
