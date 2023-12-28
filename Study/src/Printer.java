public class Printer {

    static void printArgs(String... args) {
        if (args != null) {
            for (String inf : args) {
                System.out.print(inf + " ");
            }
        }
    }
}



