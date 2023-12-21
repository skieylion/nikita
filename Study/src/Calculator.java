public class Calculator {
    int num1;
    int num2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }
//add,substruct, divide, multiply
    public int add() {
        return num1 + num2;
    }
    public int substruct() {
        return num1 - num2;
    }
    public int divide() {
        return num1 / num2;
    }
    public int multiply() {
        return num1 * num2;
    }
}
