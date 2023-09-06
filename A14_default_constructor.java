public class A14_default_constructor {

    float a;
    float b;

    A14_default_constructor() {
        a = 10;
        b = 10;
    }

    void add() {
        System.out.println("add = " + (a + b));
    }

    void minus() {
        System.out.println("minus = " + (a - b));
    }

    void multiply() {
        System.out.println("multiply = " + (a * b));
    }

    void devide() {
        System.out.println("divide = " + (a / b));
    }

    void remender() {
        System.out.println("remender = " + (a % b));
    }

    public static void main(String[] args) {
        A14_default_constructor A = new A14_default_constructor();
        A.add();
        A.minus();
        A.multiply();
        A.devide();
        A.remender();
    }
}
