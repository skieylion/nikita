package ru.nikita.tasks;

import java.util.Scanner;

public class OperTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        switch (x){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Thu");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Число только от 1 до 7");

        }
    }

}
