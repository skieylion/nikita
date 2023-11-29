package ru.nikita.tasks;

import java.util.Scanner;

public class Zadacha4 {
    public static void main( String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите 3 числа");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double k = (x + y + z) / 3;
        System.out.println(k);
    }
}
