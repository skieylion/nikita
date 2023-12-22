public class Calculator {

    public static int add( int... args) {

        int resultSum = 0;
        for (int value : args) {
            resultSum = resultSum + value;
        }
        System.out.println(resultSum);;
        return resultSum;
    }
    public static int substruct(int num1, int num2) {
        return num1 - num2;
    }
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
