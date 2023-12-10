package ru.nikita.tasks;

public class MassTask3 {
    public static void main(String[] args) {
        char s = 'a';
        String[][] arrayOfSymbol = new String[3][6];
        for (int i = 0; i < arrayOfSymbol.length; i++) {
            for (int j = 0; j < arrayOfSymbol[0].length; j++) {
                arrayOfSymbol[i][j] = s + "" + (j + 1);
                System.out.print(arrayOfSymbol[i][j] + " ");

            }
            s++;
            System.out.println();
        }


    }
}
