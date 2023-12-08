package ru.nikita.tasks;

public class CyclTask1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 5 == 0 & j % 5 == 0) {
                    break;
                }
                System.out.print(i);
                System.out.println(j);
            }

        }
    }
}
