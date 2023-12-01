package ru.nikita.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class OperTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x == 1) {
            System.out.println("Понедельник");
        }
        if (x == 2) {
            System.out.println("Вторник");
        }
        if (x == 3) {
            System.out.println("Среда");
        }
        if (x == 4) {
            System.out.println("Четверг");
        }
        if (x == 5) {
            System.out.println("Пятница");
        }
        if (x == 6 | x == 7) {
            System.out.println("Выходной");
        }

    }
}
