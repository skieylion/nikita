package ru.nikita.tasks;

public class MassTask4 {
    public static void main(String[] args) {
        char[][] saw = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'g', 'o'}};
        for (char[] sew : saw) {
            for (char siw : sew) {
                System.out.print(siw + " ");
            }
            System.out.println();
        }

    }
}
