package ru.nikita.tasks;

public class ArithTask3 {
    public static void main(String[] args) {
        int a = 8;
        ArithTask3.blink(a);
        ArithTask3.run(a);
        ArithTask3.isFirstLampOn(a);
    }

    private static void blink(int a) {
        a = ~a;
        System.out.println(Integer.toBinaryString(a));
    }

    private static void run(int a) {
        int i = a << 2;
        System.out.println(Integer.toBinaryString(i));
    }

    private static void isFirstLampOn(int a) {
        int x = 9;
        int s = a & x;
        System.out.println(Integer.toBinaryString(s));

    }
}
