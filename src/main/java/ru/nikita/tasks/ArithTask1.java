package ru.nikita.tasks;

import java.util.Scanner;

public class ArithTask1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите целое число");
        double x = in.nextDouble();
        if ( x % 2 == 0 ) {
            System.out.println("Данное число четное");
        } else {
            System.out.println("Данное число не четное");
        }
    }
}
