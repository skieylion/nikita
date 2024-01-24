package ru.nikita.tasks;

public class Queue {

    int size;

    int[] array;
    int index;

    Queue(int size) {
        this.size = size;
        index = 0;
        array = new int[size];
    }


    public void push(int element) {
        array[index++ % this.size] = element;
    }

    public void pop() {
        array[--index % size] = 0;
    }


}
