public class MathUtils {

    double a;
    int x;
    int y;


    public static double getFactorial(double a){
        int factorial = 1;
        for (int i = 1; i <= a; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int getMax(int x, int y){
        int max = 0;
        if (x > y){
            max = x;
            return max;
        }
        else max = y;
        return max;
    }

}
