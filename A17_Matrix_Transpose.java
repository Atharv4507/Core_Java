import java.util.Scanner;

public class A17_Matrix_Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];
        System.out.println("Enter 1st matrix: ");
        for (int i = 1; i < 3; i++)
        {
            for (int j = 1; j < 3; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("You'r matrix is: ");
        for (int i = 1; i < 3; i++)
        {
            for (int j = 1; j < 3; j++) 
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("You'r matrix Transpose is: ");
        for (int i = 1; i < 3; i++)
        {
            for (int j = 1; j < 3; j++) 
            {
                System.out.print(a[j][i]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(sc);
    }
}
