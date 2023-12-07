package ru.nikita.tasks;

public class CyclTask2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > 5) {
                    continue;
                }
                System.out.print(i);
                System.out.println(j);
            }

        }
    }
}
