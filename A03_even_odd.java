import java.util.Scanner;

public class A03_even_odd {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number Except 0: ");
            x = sc.nextInt();
            if (x%2 == 0) {
            System.out.println("Given Number is Even");
            } else {
            System.out.println("Given Number of Odd");
            }
            System.out.println(" ");
        } while (x != 0);       
        System.out.println(" ");
        System.out.println(sc);
    }
}