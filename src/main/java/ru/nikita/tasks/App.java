package ru.nikita.tasks;

import java.util.Arrays;
import java.util.Random;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(2);
        Node node4 = new Node(4);
        Node root = new Node(1);
        root.setNext(node1);
        node1.setPrev(root);
        node1.setNext(node2);
        node2.setPrev(node1);
        node2.setNext(node3);
        node3.setPrev(node2);
        node3.setNext(node4);
        node4.setPrev(node3);
    }

}
