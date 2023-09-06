class A{
    int a,b,c;
    void getdata(){
        a = 10;
        b = 5;
    }
    void add(){
        System.out.println("Add = "+(a+b));
    }
}
class B extends A{
    void sub(){
        System.out.println("sub = "+(a-b));
    }
}
public class A22_multiple_inheritance extends B{
    void mult(){
        System.out.println("mult = "+(a*b));
    }
    public static void main(String[] args) {
        A22_multiple_inheritance A6 = new A22_multiple_inheritance();
        A6.getdata();
        A6.add();
        A6.sub();
        A6.mult();
    }
}