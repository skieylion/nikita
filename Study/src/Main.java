import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task2_1();
        task2_2();
        task3_1();
        task3_3();
        task4();
        task5();

    }

    static void task1_1(){
        Car car1 = new Car("lada", "2107", 1993);
        Car car2 = new Car("toyota", "camry", 2022);
        Car car3 = new Car("bmw", "x5", 2009);

        System.out.println(car1.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car3.getYear());
        car3.setYear(2011);
        System.out.println(car3.getYear());
    }
    static void task1_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
    }

    static void task2_1() {
        // 2.1 Создайте метод, который принимает целочисленный аргумент и изменяет его значение внутри метода
        int number = 1;
        System.out.println(Plus1.plus1(number));
        System.out.println(number);
    }
    static void task2_2() {
        Student Mila = new Student();
        FillStudents.fillStudentData(Mila, "милА", 4, "ИВТ", "5 4 4 5 5" );
        System.out.println(Mila.getName());
        System.out.println(Mila.getAge());
        System.out.println(Mila.getMajor());
        System.out.println(Mila.getGrades());
    }
    static void task3_1() {
        int a = 5;
        int x = 15;
        int y = 10;

        System.out.println(MathUtils.getFactorial(a));
        System.out.println(MathUtils.getMax(x,y));
    }
    static void task3_3() {
        MathUtils.getFactorial(Constants.PI);
    }
    static void task4() {
        Sum sum = new Sum();
        sum.sum(1, 2, 3);
        sum.sum(2, 2, 2);
        sum.sum(1, 1, 1);
    }
    static void task5() {
        Printer.printDetails("Mila", "dog", "chihua");

        Printer.printInfo("car", "lada", "red");
        Printer.printInfo("car", "bmw");
    }
}
