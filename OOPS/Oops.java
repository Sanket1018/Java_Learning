class Calculator {
    public int add(int a, int b) {
        int add = a + b;
        return add;
    }
}

public class Oops {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println("Addition of two numbers : " + result);
    }
    // Object Oriented Programming
    // Object - Properties and Behaviour
    // Class -
}