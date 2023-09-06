import java.util.Scanner;

interface client {
    void input();

    void output();
}

class devolper implements client {
    int id, sal;
    String name;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("id = ");
        id = sc.nextInt();
        System.out.print("sal = ");
        sal = sc.nextInt();
        System.out.print("name = ");
        name = sc.next();
    }

    public void output() {
        System.out.println("id   = " + id);
        System.out.println("sal  = " + sal);
        System.out.println("name = " + name);
    }

}

public class A26_interface {
    public static void main(String[] args) {
        devolper d = new devolper();
        d.input();
        d.output();
    }
}