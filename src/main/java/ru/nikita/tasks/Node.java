package ru.nikita.tasks;

public class Node {
    private Node next;

    private final int value;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public Node next() {
        return next;
    }

    public int getValue() {
        return value;
    }
}
