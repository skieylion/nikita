package ru.nikita.tasks;

import java.util.Scanner;

public class Zadach2 {
    public static void main( String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите 3 числа");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        x = x < 0 ? -x : x;
        y = y < 0 ? -y : y;
        z = z < 0 ? -z : z;
        if ( x < y && y < z ) {
            System.out.println(x);
        } else {
        }
        if (y < x && x < z) {
            System.out.println(y);
        } else {
        }
        if (z < y && y < x) {
            System.out.println(z);
        } else {
        }
    }
}
