public class Printer {

    static void printInfo(String... info) {
        if (info != null) {
            for (String inf : info) {
                System.out.print(inf + " ");
            }
        }
    }
}



