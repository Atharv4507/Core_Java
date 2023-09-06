interface a1{
    void show();
}
interface b1{
    void display();
}
class c1 implements a1,b1{
    public void show(){
        System.out.println("class c");
    }
    public void display(){
        System.out.println("c class");
    }
}
class d1 implements a1,b1{
    public void show(){
        System.out.println("class d");
    }
    public void display(){
        System.out.println("d class");
    }
}
public class A27_multiple_inheritance {
    public static void main(String[] args) {
        d1 d3 = new d1();
        c1 c3 = new c1();
        d3.show();
        d3.display();
        c3.show();
        c3.display();
    }
}
