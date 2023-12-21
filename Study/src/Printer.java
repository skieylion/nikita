public class Printer {
    static void printDetails(String name, String... details) {
        System.out.print(name + " ");
        for (String detail : details) {
            System.out.print(detail);
            System.out.print(" ");
        }
    }

    //5.1 Создайте перегруженные версии метода (например, 'printInfo'), одна версия которого использует varargs, а другая — фиксированное количество аргументов.
    static void printInfo(String... info) {
        for (String inf : info) {
            System.out.print(inf);
            System.out.print(" ");
        }
    }
    static void printInfo(String text1, String text2) {
        System.out.print(text1 + " " + text2);
    }

}
