import java.util.Scanner;

public class A05_posi_negi {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if (n >= 0) {
                System.out.println("Number is positive");
            } else {
                System.out.println("Number is Negative");
            }
            System.out.println(" ");
        }while(n != 0);
        System.out.println(" ");
        System.out.println(sc);
    }
}