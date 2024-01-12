package ru.nikita.tasks;

import static java.awt.AWTEventMulticaster.add;

public class App {
    public static void main(String[] args) {
        /* Random random = new Random();
        Square square1 = new Square((int) (random.nextDouble() * 100));
        Square square2 = new Square((int) (random.nextDouble() * 100));
        System.out.println(square2.getSide());
        Cube cube1 = Cube.cubeOfSquare(square1);
        Cube cube2 = Cube.cubeOfSquare(square2);
        System.out.println();
        Calculator calculator = new Calculator();
        System.out.println("Сложение - " + calculator.add(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Вычетание - " + calculator.substruct(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Умножение - " + calculator.multiply(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Деление - " + calculator.divide(512, 2, 2, 2, 2, 2, 2));
        */

        show();
    }

    public static void show() {
        Time time1 = new Time(23, 22, 13);
        System.out.println(time1.hour + ":" + time1.minutes + ":" + time1.second);
        Time time2 = new Time(23, 22);
        System.out.println(time2.hour + ":" + time2.minutes + ":0" + time2.second);
        Time time3 = new Time(22);
        System.out.println(time3.hour + ":" + time3.minutes + "0:0" + time3.second);
    }


}
