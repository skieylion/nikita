package ru.nikita.tasks;

public class MassTask4 {
    public static void main(String[] args) {
        char[][] May = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'g', 'o'}};
        for (char[] Rick : May) {
            for (char Sam : Rick) {
                System.out.print(Sam + " ");
            }
            System.out.println();
        }

    }
}
