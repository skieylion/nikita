public class Calculator {

    public static int add(int a, int b, int... args) {
        int resultSum = a + b;
        if (args != null){
            for (int i = 0; i < args.length; i++){
                resultSum += args[i];
            }
        }
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
