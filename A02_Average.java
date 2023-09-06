import java.util.Scanner;

public class A02_Average {
    public static void main(String[] args) {
        float physics, chemistry, maths;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out of 100*");
        System.out.println(" ");
        System.out.print("Enter the marks of Physics: ");
        physics = sc.nextInt();
        System.out.print("Enter the marks of chemistry: ");
        chemistry = sc.nextInt();
        System.out.print("Enter the marks of maths: ");
        maths = sc.nextInt();
        float result = (physics + chemistry + maths) / 3;
        System.out.println("Your Result is: " + result);
        System.out.println(" ");
        if (result > 35) 
        {
            System.out.println("Congratulation***");
            System.out.println("You are pass!");
        } 
        else
        {
            System.out.println("You are Fail");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(sc);
    }
}
