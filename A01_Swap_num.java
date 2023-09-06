import java.util.Scanner;

public class A01_Swap_num {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        x = sc.nextInt();
        System.out.print("Enter a number 2: ");
        y = sc.nextInt();
        System.out.format("Before Swapping Numbers are %d and %d\n",x,y);
        int t = x;
        x = y;
        y = t;
        System.out.format("After  Swapping Numbers are %d and %d\n",x,y);
        System.out.println(sc);
    }
}
