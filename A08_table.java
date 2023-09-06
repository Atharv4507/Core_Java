import java.util.Scanner;

public class A08_table {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+"*"+i+" = "+(n*i));
        }
        System.out.println(" ");
        System.out.println(sc);
    }
}
