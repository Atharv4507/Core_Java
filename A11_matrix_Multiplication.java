import java.util.Scanner;

public class A11_matrix_Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("For 2*2 Matrix Enter 0");
        System.out.println("For 3*3 Matrix Enter 1");
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        if (n == 0) {

            int a[][] = new int[4][4];
            int b[][] = new int[4][4];
            int c[][] = new int[4][4];
            System.out.println("Enter 1st matrix: ");
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter 2nd matrix: ");
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 3; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("1st matrix is: ");
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 3; j++) {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println(" ");
            }
            System.out.println("2nd matrix is: ");
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 3; j++) {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println(" ");
            }
            System.out.println("matrix multiplicatio is: ");
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 3; j++) {
                    c[i][j] = a[i][j] * b[i][j];
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println(" ");
            }
        } else if (n == 1) {

            int a[][] = new int[9][9];
            int b[][] = new int[9][9];
            int c[][] = new int[9][9];
            System.out.println("Enter 1st matrix: ");
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter 2nd matrix: ");
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("1st matrix is: ");
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println(" ");
            }
            System.out.println("2nd matrix is: ");
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println(" ");
            }
            System.out.println("matrix multiplication is: ");
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    c[i][j] = a[i][j] * b[i][j];
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println(" ");
            }
        } 
        else 
        {
            System.out.println("You Entered a wrong number");
        }
    }
}