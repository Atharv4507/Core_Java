public class A15_parameterize_constructor {

    int a;
    int b;

    A15_parameterize_constructor(int p,int q){
        a = p;
        b = q;
    }
    void add(){
        System.out.println(a+" + "+b+" = " + (a + b));
    }
    public static void main(String[] args) {
        
        A15_parameterize_constructor A1 = new A15_parameterize_constructor(45, 7);
        A1.add();
    }
}
