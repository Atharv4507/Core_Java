import java.util.Scanner;

public class A07_SumOf {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of total number is: "+sum);
        System.out.println(" ");
        System.out.println(sc);
    }
}

// public class A07_SumOf{
//     public static void main(String[] args) {
//         int n,sum =0;
//         int a[] = new int[20];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             sum = sum + a[i];
//         }
//         System.out.println("sum: "+sum);
//     }
// }