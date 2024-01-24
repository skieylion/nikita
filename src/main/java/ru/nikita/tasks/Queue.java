package ru.nikita.tasks;

public class Queue {

    int size;

    int[] array;
    int index = 0;

    Queue(int size) {
        this.size = size;
        array = new int[size];
    }


    public void push(int element) {
        array[index++ % this.size] = element;
    }

    public void pop() {
        array[--index % size] = 0;
    }


}
