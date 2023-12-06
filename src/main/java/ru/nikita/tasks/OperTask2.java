package ru.nikita.tasks;

import java.util.Scanner;

public class OperTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();
        if (x >= 0 && x < 10) {
            System.out.println("Положительное число меньше 10 или ноль");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
