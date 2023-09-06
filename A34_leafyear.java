import java.util.Scanner;

public class A34_leafyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n;
        do{
            System.out.print("Enter year: ");
            n = sc.nextInt();
            if (n % 4 == 0) {
                System.out.println("The year is leap year");
            } else {
                System.out.println("The year is not leap year");
            }
        }while(n!=0);
        System.out.println(sc);
    }
}
