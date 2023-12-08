package ru.nikita.tasks;

public class MassTask3 {
    public static void main(String[] args) {
        char s = 'a';
        String[][] MasMay = new String[3][6];
        for (int i = 0; i < MasMay.length; i++) {
            for (int j = 0; j < MasMay[0].length; j++) {
                MasMay[i][j] = s + "" + (j + 1);
                System.out.print(MasMay[i][j] + " ");

            }
            s++;
            System.out.println();
        }


    }
}
