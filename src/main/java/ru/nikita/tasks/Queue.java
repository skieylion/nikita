package ru.nikita.tasks;

public class Queue {

    public static final int size = 3;

    int[] array;
    int i = 0;

    Queue() {
        array = new int[size];
    }


    public void push(int element) {
        array[i++%size] = element;
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " + ");
    }

    public void pop() {
        array[--i%size] = 0;
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " - ");
    }


}
