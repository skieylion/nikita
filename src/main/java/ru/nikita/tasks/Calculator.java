package ru.nikita.tasks;

public class Calculator {



    public int add(int x, int y, int... args) {
        int result = x + y;
        for (int v : args) {
            result += v;
        }
        return result;
    }

    public int substruct(int x, int y, int... args) {
        int result = x - y;
        for (int v : args) {
            result -= v;
        }
        return result;
    }

    public int multiply(int x, int y, int... args) {
        int result = x * y;
        for (int v : args) {
            result *= v;
        }
        return result;
    }

    public int divide(int x, int y, int... args) {
        int result = x / y;
        for (int v : args) {
            result /= v;
        }
        return result;
    }

}
