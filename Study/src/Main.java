import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* 1.1
        Car car1 = new Car("lada", "2107", 1993);
        Car car2 = new Car("toyota", "camry", 2022);
        Car car3 = new Car("bmw", "x5", 2009);

        System.out.println(car1.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car3.getYear());
        car3.setYear(2011);
        System.out.println(car3.getYear());
         */

        /* 1.2
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите операцию: ");
        String operation = sc.next();

        Calculator calc = new Calculator(num1, num2, operation);
        System.out.println(calc.calculation());
         */

        /* 2.1
        //Создайте метод, который принимает целочисленный аргумент и изменяет его значение внутри метода
        int x = 1;
        Change value = new Change(x);
        value.tryChange(x);
        System.out.println(value.getX());
        System.out.println(x);
         */

        /*2.2
        Student Mila = new Student();
        Student.fillStudentData(Mila, "Мила", 4, "ИВТ", "5 4 4 5 5" );
        System.out.println(Mila.getName());
        System.out.println(Mila.getAge());
        System.out.println(Mila.getMajor());
        System.out.println(Mila.getGrades());

         */

        //3.1
        int a = 5;
        int x = 15;
        int y = 10;

        System.out.println(MathUtils.getFactorial(a));
        System.out.println(MathUtils.getMax(x,y));


        //3.3
        MathUtils.getFactorial(Constants.pi);

        Sum sum = new Sum();

        //4
        sum.sum(1, 2, 3);
        sum.sum(2, 2, 2);
        sum.sum(1, 1, 1);


        //5
        sum.printDetails("Mila", "Milushka", "Milka");
        sum.printDetails("car", "red");

        sum.printInfo("mur", " mur");
        sum.printInfo("hello");








    }



}
