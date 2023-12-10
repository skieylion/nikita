package ru.nikita.tasks;

public class MassTask4 {
    public static void main(String[] args) {
        char[][] arraySymbol = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'g', 'o'}};
        for (char[] proSymbol : arraySymbol) {
            for (char symbol : proSymbol) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

    }
}
