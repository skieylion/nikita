//4
    public class Sum {
    static void sum(int... args) {
        int resultSum = 0;
        for (int value : args) {
            resultSum = resultSum + value;
        }
        System.out.println(resultSum);
    }

    static void printDetails(String... details) {
        for (String detail : details) {
            System.out.print(detail);
            System.out.print(" ");
        }
    }


    //5.1
    static void printInfo(String... info) {
        for (String inf : info) {
            System.out.print(inf);
            System.out.print(" ");
        }
    }
    static void printInfo(String text) {
            System.out.print(text);
        }


    }
