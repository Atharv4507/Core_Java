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
public class A21_single_inheritance extends A{

    void sub(){
        System.out.println("minus = "+(a-b));
    }
    public static void main(String[] args) {       
        A21_single_inheritance A5 = new A21_single_inheritance();
        A5.getdata();
        A5.add();
        A5.sub();
    }
}