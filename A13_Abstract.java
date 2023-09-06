import java.util.Scanner;

abstract class shape{
    abstract void show();
}

class circle1 extends shape{
    void show(){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = sc.nextInt();
        System.out.println("circumference of the circle is: "+(Math.PI*2*r));
        System.out.println(" ");
        System.out.println(sc);
    }
}
class rectangle1 extends shape{
    void show(){
        int l,w,h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        l = sc.nextInt();
        System.out.print("Enter the width : ");
        w = sc.nextInt();
        System.out.print("Enter the height: ");
        h = sc.nextInt();
        System.out.println("circumference of rectangle is: "+(l*h*w));
        System.out.println(" ");
        System.out.println(sc);
    }
}

public class A13_Abstract {
    public static void main(String[] args) {
        rectangle1 r = new rectangle1();
        r.show();
        circle1 c = new circle1();
        c.show();
    }
}