package ru.nikita.tasks;

public class Node {
    private Node next;

    private Node prev;

    private final int value;

    Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }


    public Node next() {
        return next;
    }

    public Node prev() {
        return prev;
    }

    public int getValue() {
        return value;
    }
}
