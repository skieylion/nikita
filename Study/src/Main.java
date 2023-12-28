public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task2_2();
        task3_1();
        task4();
        task5();

    }

    static void task1_1() {
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
        System.out.println(Calculator.add(1, 2, 5, 2));
        System.out.println(Calculator.add(1, 2, null));
        System.out.println(Calculator.substruct(5,2, 2));
        System.out.println(Calculator.divide(10, 2, 2));
        System.out.println(Calculator.multiply(2, 2, 2));
    }

    static void task2_2() {
        Student Mila = new Student();
        FillStudent.fillStudentData(Mila, "милА", 4, "ИВТ", "5 4 4 5 5");
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
        System.out.println(MathUtils.getMax(x, y));
    }

    static void task4() {
        Printer.printArgs("Mila", "dog", "chihua");
        Printer.printArgs("car", "bmw");
        Printer.printArgs(null);
    }

    static void task5(){

        Rectangle rectangle = new Rectangle(5,4);
        System.out.println(rectangle.calculateArea());

        Square square  = new Square(5);
        System.out.println(square.calculate_area());

        Parallelogram parallelogram1 = new Parallelogram(4, 7);
        System.out.println(parallelogram1.calculateArea());

        Parallelogram parallelogram2 = new Parallelogram(10, 10, 150);
        System.out.println(parallelogram2.calculateArea_with_angle());
    }
}
