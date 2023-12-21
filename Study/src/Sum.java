//4
    public class Sum {

    static void sum(int... args) {
        int resultSum = 0;
        for (int value : args) {
            resultSum = resultSum + value;
        }
        System.out.println(resultSum);
    }

    }
