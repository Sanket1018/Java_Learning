class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int res = obj.add(10, 20);
        System.out.println(res);
        int res1 = obj.add(10, 20, 30);
        System.out.println(res1);
    }

}
