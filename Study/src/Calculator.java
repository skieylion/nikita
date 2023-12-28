public class Calculator {

    public static int add(int a, int b, int... args) {
        int resultSum = a + b;
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                resultSum += args[i];
            }
        }
        return resultSum;
    }

    public static int substruct(int a, int b, int... args) {
        int resultSubstruct = a - b;
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                resultSubstruct -= args[i];
            }
        }
        return resultSubstruct;
    }

    public static int divide(int a, int b, int... args) {
        int resultDivide = a / b;
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                resultDivide /= args[i];
            }
        }
        return resultDivide;
    }

    public static int multiply(int a, int b, int... args) {
        int resultMultiply = a * b;
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                resultMultiply *= args[i];
            }
        }
        return resultMultiply;
    }

}
