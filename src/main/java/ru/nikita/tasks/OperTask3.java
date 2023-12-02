package ru.nikita.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class OperTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x == 1) {
            System.out.println("Понедельник");
        } else if (x == 2) {
            System.out.println("Вторник");
        } else if (x == 3) {
            System.out.println("Среда");
        } else if (x == 4) {
            System.out.println("Четверг");
        } else if (x == 5) {
            System.out.println("Пятница");
        } else if (x == 6 || x == 7) {
            System.out.println("Выходной");
        }

    }
}
