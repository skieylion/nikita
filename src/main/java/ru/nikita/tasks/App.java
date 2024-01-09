package ru.nikita.tasks;

import java.util.Random;
import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // double radius = scanner.nextDouble();


        /* Random random = new Random();
        Square square1 = new Square((int) (random.nextDouble() * 100));
        Square square2 = new Square((int) (random.nextDouble() * 100));
        System.out.println(square2.getSide());
        Cube cube1 = Cube.cubeOfSquare(square1);
        Cube cube2 = Cube.cubeOfSquare(square2);
        System.out.println();
        */

        Calculator calculator = new Calculator();

        System.out.println("Сложение - " + calculator.add(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Вычетание - " + calculator.substruct(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Умножение - " + calculator.multiply(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Деление - " + calculator.divide(512, 2, 2, 2, 2, 2, 2));



    }


}
