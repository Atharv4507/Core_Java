public class A16_factorial_constructor {
    int f = 1;
    int n;

    A16_factorial_constructor(int a) {
        n = a;
    }

    void fact() {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f = f * i;
        }
        System.out.println("Factorial of " + n + " is: " + f);
    }

    public static void main(String[] args) {
        A16_factorial_constructor A2 = new A16_factorial_constructor(5);
        A2.fact();
    }
}
