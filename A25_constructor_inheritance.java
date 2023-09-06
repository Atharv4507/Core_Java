class base2{
    int x;
    base2(){
        System.out.println("Base");
    }
    base2(int a){
        x = a;
        System.out.println("x = "+x);
    }
}
class derived2 extends base2{
    int y;
    derived2(){
        System.out.println("derived");
    }
    derived2(int p,int q){
        super(p);
        y = q;
        System.out.println("c = "+(p*q));
    }
}

public class A25_constructor_inheritance {
    public static void main(String[] args) {
        derived2 d3 = new derived2();
        derived2 d4 = new derived2(5, 4);
        d3.equals(d4);
        
    }
}