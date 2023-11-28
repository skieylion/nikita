package ru.nikita.tasks;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, напишите свой вес");
        double weight = in.nextDouble();
        System.out.println("Пожалуйста, напишите свой рост");
        double height = in.nextDouble();
        height = height / 100;
        double BMI = (weight / (height * height));
        System.out.printf("%.2f", BMI);
        if (BMI < 18.5) {
            System.out.println("У вас недостаточнй вес");
        }
        if (BMI > 18.4 && BMI < 30) {
            System.out.println(" -- У вас нормальный вес");
        }
        if (BMI > 29.5) {
            System.out.println("У вас ожирение");
        }

    }
}

