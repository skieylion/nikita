package ru.nikita.tasks;

public class TaskD {
    public static void main(String[] args) {
        int myInt1 = 9;
        double myDouble1 = 5.8;
        myInt1 = (int) myDouble1;
        System.out.println(myInt1);
        System.out.println(myDouble1);

        int myInt2 = 9;
        double myDouble2 = 5.8;
        myDouble2 = myInt2;
        System.out.println(myInt2);
        System.out.println(myDouble2);
    }
}