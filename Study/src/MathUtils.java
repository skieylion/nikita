public final class MathUtils {

    double a;
    int x;
    int y;


    public static double getFactorial(double a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int getMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

}
