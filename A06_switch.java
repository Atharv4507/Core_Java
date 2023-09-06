import java.util.Scanner;

public class A06_switch {

    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Case 1 for triangle");
        System.out.println("Case 2 for square");
        System.out.println("Case 3 for circle");
        System.out.print("Enter case: ");
        c = sc.nextInt();
        switch (c) {
            case 1:
                float h, b;
                System.out.print("Height : ");
                h = sc.nextInt();
                System.out.print("Breadth: ");
                b = sc.nextInt();
                System.out.println("Area of triangle is: " + (0.5 * h * b));
                break;
            case 2:
                float l;
                System.out.print("Length: ");
                l = sc.nextInt();
                System.out.println("Area of square is: " + (4 * l));
                break;
            case 3:
                float r;
                System.out.print("Radius: ");
                r = sc.nextInt();
                System.out.println("Area of circle: " + (Math.PI * r * r));
                break;
            default:
                break;
        }
        System.out.println(" ");
        System.out.println(sc);
    }
}