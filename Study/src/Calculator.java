public class Calculator {
    int num1;
    int num2;
    String operation;

    public Calculator(int num1, int num2, String operation){
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
    public int calculation(){
        int answer = 0;
        switch(operation) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "/":
                answer = num1 / num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
        }
        return answer;
    }

}
